package org.howard.edu.lsp.midterm.question4;
import java.util.HashMap;

public class MapUtilities {
    /**
     * Finds the number of common key/value pairs between two HashMaps.
     * @param map1 The first HashMap.
     * @param map2 The second HashMap.
     * @return The number of common key/value pairs.
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Return 0 if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0;

        // Iterate through the entries in map1
        for (String key : map1.keySet()) {
            // Check if map2 contains the same key and value
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++;
            }
        }

        return commonCount;
    }
}

/**
 * ChatGPT for javadoc and naming variables 
 */