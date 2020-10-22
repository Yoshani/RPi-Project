package com.rpi.springbootrestapi.controller.dto;

import java.util.Date;
import java.util.UUID;

public class TemperatureDTO {

    private UUID id;

    private double temperature;

    private Date date;



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
