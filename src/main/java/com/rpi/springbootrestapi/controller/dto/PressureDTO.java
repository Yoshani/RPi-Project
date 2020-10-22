package com.rpi.springbootrestapi.controller.dto;

import java.util.Date;
import java.util.UUID;

public class PressureDTO {

    private UUID id;

    private double pressure;

    private Date date;



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}