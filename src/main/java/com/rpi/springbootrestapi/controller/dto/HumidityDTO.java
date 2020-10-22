package com.rpi.springbootrestapi.controller.dto;

import java.util.Date;
import java.util.UUID;

public class HumidityDTO {

    private UUID id;

    private double humidity;

    private Date date;



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
