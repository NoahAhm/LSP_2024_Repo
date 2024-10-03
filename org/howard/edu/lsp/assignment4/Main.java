package org.howard.edu.lsp.assignment4;

// Main class to execute the ATC System
public class Main {
    public static void main(String[] args) {
        // Create aircraft instances
        Aircraft aircraft1 = new Aircraft("Boeing 737", 500, 10000);
        Aircraft aircraft2 = new Aircraft("Airbus A320", 600, 4000);

        // Create the ATC system and transponder
        ATCSystem atcSystem = new ATCSystem();
        Transponder transponder = new Transponder();

        // Aircraft transmit data via transponder to ATC system
        transponder.sendData(atcSystem, aircraft1);
        transponder.sendData(atcSystem, aircraft2);

        // Update display every 10 seconds
        atcSystem.updateDisplay();

        // Simulate querying the database for specific aircraft
        String queriedData = atcSystem.queryAircraftData("Boeing 737");
        System.out.println("Queried Data: " + queriedData);
    }
}
