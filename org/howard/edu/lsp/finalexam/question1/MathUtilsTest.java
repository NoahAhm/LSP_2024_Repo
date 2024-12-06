package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    private MathUtils mathUtils = new MathUtils();

    // Test cases for factorial method
    @Test
    public void testFactorial_WhenGivenZero_ShouldReturnOne() {
        assertEquals(1, mathUtils.factorial(0));
    }

    @Test
    public void testFactorial_WhenGivenPositiveNumber_ShouldReturnFactorial() {
        assertEquals(120, mathUtils.factorial(5));
    }

    @Test
    public void testFactorial_WhenGivenNegative_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1));
    }

    // Test cases for isPrime method
    @Test
    public void testIsPrime_WhenGivenTwo_ShouldReturnTrue() {
        assertTrue(mathUtils.isPrime(2));
    }

    @Test
    public void testIsPrime_WhenGivenNonPrimeNumber_ShouldReturnFalse() {
        assertFalse(mathUtils.isPrime(4));
    }

    @Test
    public void testIsPrime_WhenGivenPrimeNumber_ShouldReturnTrue() {
        assertTrue(mathUtils.isPrime(17));
    }

    // Test cases for gcd method
    @Test
    public void testGcd_WhenGivenCoprimeNumbers_ShouldReturnOne() {
        assertEquals(1, mathUtils.gcd(9, 28));
    }

    @Test
    public void testGcd_WhenGivenMultiples_ShouldReturnCorrectGcd() {
        assertEquals(6, mathUtils.gcd(18, 24));
    }

    @Test
    public void testGcd_WhenGivenBothZeros_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
    }
}
