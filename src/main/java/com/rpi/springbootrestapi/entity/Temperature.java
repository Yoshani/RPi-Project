package com.rpi.springbootrestapi.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class Temperature {

    @Id
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id = new UUID(0,0);

    private double temperature;

    private Date date;

    public Temperature() {
    }

    public Temperature(UUID id, double temperature, Date date) {
        this.id = id;
        this.temperature = temperature;
        this.date = date;
    }

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
