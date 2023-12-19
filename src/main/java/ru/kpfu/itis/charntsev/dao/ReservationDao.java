package ru.kpfu.itis.charntsev.dao;

import ru.kpfu.itis.charntsev.model.Reservation;
import ru.kpfu.itis.charntsev.util.DatabaseConnectionUtil;

import java.sql.*;

public class ReservationDao {

    private final Connection connection = DatabaseConnectionUtil.getConnection();

    public void save(Reservation reservation) {
        String sql = "INSERT INTO reservations(performance, date_of_reservation, type_of_performance) values (?, ?, ?);";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, reservation.getPerformanceId());
            statement.setDate(2, reservation.getDateOfReservation());
            statement.setString(3, reservation.getPerformanceType().toString());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean checkDate(Reservation reservation) {
        Date potentialDate = reservation.getDateOfReservation();

        String sql = "SELECT date_of_reservation FROM reservation WHERE date_of_reservation = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDate(1, reservation.getDateOfReservation());
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                Date date = set.getDate("date_of_reservation");
                if (date != null) {
                    return false;
                }
            }
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
