package org.howard.edu.lsp.assignment2;

import java.io.*;
import java.util.*;

public class wordCounter {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();

        File file = new File("org/howard/edu/lsp/assignment2/words.txt"); 
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("[^a-zA-Z]+");

            for (String word : words) {
                if (word.length() > 3) {
                    word = word.toLowerCase();
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        reader.close();

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}