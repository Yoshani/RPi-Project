package com.rpi.springbootrestapi.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class LightIntensity {

    @Id
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id = new UUID(0,0);

    private double lightIntensity;

    private Date date;

    public LightIntensity() {
    }

    public LightIntensity(UUID id, double humidity, Date date) {
        this.id = id;
        this.lightIntensity = humidity;
        this.date = date;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getLightIntensity() {
        return lightIntensity;
    }

    public void setLightIntensity(double lightIntensity) {
        this.lightIntensity = lightIntensity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

