package com.rpi.springbootrestapi.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class Humidity {

    @Id
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id = new UUID(0,0);

    private double humidity;

    private Date date;

    public Humidity() {
    }

    public Humidity(UUID id, double humidity, Date date) {
        this.id = id;
        this.humidity = humidity;
        this.date = date;
    }

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

