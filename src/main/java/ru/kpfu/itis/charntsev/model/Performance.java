package ru.kpfu.itis.charntsev.model;


import java.sql.Date;

public class Performance {
    private int id;
    private int hall_id;
    private String name;
    private int price;
    private Date dateStart;
    private Date dateEnd;

    public Performance(int id, int hall_id, String name, int price, Date dateStart, Date dateEnd) {
        this.id = id;
        this.hall_id = hall_id;
        this.name = name;
        this.price = price;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHall_id() {
        return hall_id;
    }

    public void setHall_id(int hall_id) {
        this.hall_id = hall_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }
}
