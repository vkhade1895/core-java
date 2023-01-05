package com.example.model;

import javax.persistence.Entity;

public class Appointment {

    private String specialization;
    private String location;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "specialization='" + specialization + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
