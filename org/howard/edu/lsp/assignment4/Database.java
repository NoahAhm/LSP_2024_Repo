package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

// Class representing a Database that stores aircraft information
public class Database {
    private List<String> aircraftData = new ArrayList<>();

    // Store aircraft data
    public void storeData(String data) {
        aircraftData.add(data);
    }

    // Retrieve all aircraft data
    public List<String> getAllData() {
        return aircraftData;
    }

    // Query specific aircraft data by type
    public String queryData(String aircraftType) {
        for (String data : aircraftData) {
            if (data.contains(aircraftType)) {
                return data;
            }
        }
        return "Aircraft not found";
    }
}
