package ru.kpfu.itis.charntsev.dao;

import ru.kpfu.itis.charntsev.model.Performance;
import ru.kpfu.itis.charntsev.util.DatabaseConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PerformanceDao {

    private final Connection connection = DatabaseConnectionUtil.getConnection();

    public Performance get(int id) {
        String sql = "SELECT * FROM performance WHERE id = ?;";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                return new Performance(
                        set.getInt("id"),
                        set.getInt("hall_id"),
                        set.getString("name"),
                        set.getInt("price"),
                        set.getDate("date_start"),
                        set.getDate("date_end")

                );
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Performance> getAll() {
        String sql = "SELECT * FROM performance;";
        try {
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery(sql);
            List<Performance> performances = new ArrayList<>();
            while (set.next()) {
                performances.add(
                        new Performance(
                                set.getInt("id"),
                                set.getInt("hall_id"),
                                set.getString("name"),
                                set.getInt("price"),
                                set.getDate("date_start"),
                                set.getDate("date_end")
                        )
                );
            }
            return performances;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
