package org.howard.edu.lsp.assignment4;

// Class representing an Aircraft
public class Aircraft {
    private String aircraftType;
    private int speed;
    private int altitude;

    public Aircraft(String type, int speed, int altitude) {
        this.aircraftType = type;
        this.speed = speed;
        this.altitude = altitude;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAltitude() {
        return altitude;
    }

    // Transmit data using Transponder
    public String transmitData(Transponder transponder) {
        return transponder.packData(this);
    }
}
