package com.thulani.airportmanagement.domain;

public class Aircraft {
    private String model;
    private int numberOfSeats;

    public Aircraft(String model, int numberbOfSeats) {
        this.model = model;
        this.numberOfSeats = numberbOfSeats;
    }

    public String getModel() {

        return model;
    }

    public int getNbSeats() {
        return numberOfSeats;
    }
}
