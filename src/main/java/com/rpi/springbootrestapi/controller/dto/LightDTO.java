package com.rpi.springbootrestapi.controller.dto;

import java.util.Date;
import java.util.UUID;

public class LightDTO {

    private UUID id;

    private double light;

    private Date date;



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getLight() {
        return light;
    }

    public void setLight(double light) {
        this.light = light;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
