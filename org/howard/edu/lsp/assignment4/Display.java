package org.howard.edu.lsp.assignment4;

import java.util.List;

// Class for displaying the aircraft data
public class Display {
    // Refresh the graphical display with updated aircraft data
    public void refresh(List<String> aircraftData) {
        System.out.println("Displaying Aircraft Data:");
        for (String data : aircraftData) {
            System.out.println(data);
        }
    }
}
