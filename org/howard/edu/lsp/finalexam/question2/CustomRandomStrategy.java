package org.howard.edu.lsp.finalexam.question2;

/**
 * Implements the RandomNumberStrategy with a custom random number generation algorithm.
 * This uses a simple linear congruential generator (LCG).
 */
public class CustomRandomStrategy implements RandomNumberStrategy {
    private long seed = 123456789;

    /**
     * Generates a random number using a linear congruential generator.
     * @return a non-negative random integer.
     */
    @Override
    public int generateNumber() {
        seed = (seed * 1103515245 + 12345) & Integer.MAX_VALUE;
        return (int) seed;
    }
}
