package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Implements the RandomNumberStrategy using Java's built-in Random class.
 */
public class JavaRandomStrategy implements RandomNumberStrategy {
    private Random random = new Random();

    /**
     * Generates a positive random number using Java's Random class.
     * @return a non-negative random integer.
     */
    @Override
    public int generateNumber() {
        return random.nextInt(Integer.MAX_VALUE);
    }
}
