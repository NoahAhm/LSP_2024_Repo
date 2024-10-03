package org.howard.edu.lsp.assignment4;

import java.util.Timer;
import java.util.TimerTask;

// Main Air Traffic Control System class
public class ATCSystem {
    private Database database;
    private Display display;
    private DangerousSituationAnalyzer analyzer;

    public ATCSystem() {
        this.database = new Database();
        this.display = new Display();
        this.analyzer = new DangerousSituationAnalyzer();
    }

    // Receives data from a transponder, stores in the database, and analyzes it
    public void receiveData(String data) {
        database.storeData(data);
        analyzer.analyzeData(data);
    }

    // Continuously updates the display every 10 seconds
    public void updateDisplay() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                display.refresh(database.getAllData());
            }
        }, 0, 10000); // Refresh every 10 seconds
    }

    // Queries the database for specific aircraft data
    public String queryAircraftData(String aircraftType) {
        return database.queryData(aircraftType);
    }
}
