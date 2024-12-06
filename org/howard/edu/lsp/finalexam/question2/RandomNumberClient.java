package org.howard.edu.lsp.finalexam.question2;

/**
 * Client for the RandomNumberService.
 * This client demonstrates using the RandomNumberService with different strategies.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Using Java's built-in RNG
        service.setStrategy(new JavaRandomStrategy());
        System.out.println("Random number using Java's RNG: " + service.generateNumber());

        // Using a custom RNG strategy
        service.setStrategy(new CustomRandomStrategy());
        System.out.println("Random number using Custom RNG: " + service.generateNumber());
    }
}
