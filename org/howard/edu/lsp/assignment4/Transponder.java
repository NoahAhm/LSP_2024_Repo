package org.howard.edu.lsp.assignment4;

// Class for the Transponder to transmit packed aircraft data
public class Transponder {
    // Packs the aircraft's data into a high-density format
    public String packData(Aircraft aircraft) {
        return "Type: " + aircraft.getAircraftType() +
                ", Speed: " + aircraft.getSpeed() +
                ", Altitude: " + aircraft.getAltitude();
    }

    // Sends the packed data to the ATC system
    public void sendData(ATCSystem system, Aircraft aircraft) {
        String dataPacket = packData(aircraft);
        system.receiveData(dataPacket);
    }
}
