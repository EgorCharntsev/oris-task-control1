package ru.kpfu.itis.charntsev.model;


import java.sql.Date;

public class Reservation {
    private int id;
    private int performanceId;
    private Date dateOfReservation;
    private PerformanceType performanceType;

    public Reservation(int id, int performanceId, Date dateOfReservation, PerformanceType performanceType) {
        this.id = id;
        this.performanceId = performanceId;
        this.dateOfReservation = dateOfReservation;
        this.performanceType = performanceType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerformanceId() {
        return performanceId;
    }

    public void setPerformanceId(int performanceId) {
        this.performanceId = performanceId;
    }

    public Date getDateOfReservation() {
        return dateOfReservation;
    }

    public void setDateOfReservation(Date dateOfReservation) {
        this.dateOfReservation = dateOfReservation;
    }

    public PerformanceType getPerformanceType() {
        return performanceType;
    }

    public void setPerformanceType(PerformanceType performanceType) {
        this.performanceType = performanceType;
    }
}
