package com.example.hci_demo.utils;

import java.util.Date;

public class Event {

    private Date date;
    private String name;
    private String address;
    private String description;
    private String sDate;
    private String tableNum;
    private double rating;

    public Event(Date date, String name, String description) {
        this.date = date;
        this.name = name;
        this.description = description;
    }

    public Event(String name, String sDate, String tableNum, String address) {
        this.name = name;
        this.sDate = sDate;
        this.tableNum = tableNum;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }

    public String getTableNum() {
        return tableNum;
    }

    public void setTableNum(String tableNum) {
        this.tableNum = tableNum;
    }

    public Event(Date date, String name, String description, double rating) {
        this.date = date;
        this.name = name;
        this.description = description;
        this.rating = rating;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
