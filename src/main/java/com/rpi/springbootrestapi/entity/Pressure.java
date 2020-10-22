package com.rpi.springbootrestapi.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class Pressure {

    @Id
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id = new UUID(0,0);

    private double pressure;

    private Date date;

    public Pressure() {
    }

    public Pressure(UUID id, double pressure, Date date) {
        this.id = id;
        this.pressure = pressure;
        this.date = date;
    }

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
