package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerSetTest {
    
    @Test
    @DisplayName("Test case for clear()")
    void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.clear();
        assertTrue(set.isEmpty(), "Set should be empty after clear()");
        assertEquals(0, set.length(), "Length should be 0 after clear()");
    }

    @Test
    @DisplayName("Test case for length()")
    void testLength() {
        IntegerSet set = new IntegerSet();
        assertEquals(0, set.length(), "Length should be 0 for an empty set");
        set.add(1);
        assertEquals(1, set.length(), "Length should be 1 after adding one element");
        set.add(2);
        set.add(3);
        assertEquals(3, set.length(), "Length should be 3 after adding three elements");
        set.add(3);
        assertEquals(3, set.length(), "Adding duplicate should not increase length");
    }

    @Test
    @DisplayName("Test case for equals()")
    void testEquals() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        assertTrue(set1.equals(set2), "Two empty sets should be equal");

        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2), "Sets with same elements in different order should be equal");

        set2.add(3);
        assertFalse(set1.equals(set2), "Sets with different elements should not be equal");
    }

    @Test
    @DisplayName("Test case for contains()")
    void testContains() {
        IntegerSet set = new IntegerSet();
        assertFalse(set.contains(1), "Empty set should not contain any element");
        set.add(1);
        assertTrue(set.contains(1), "Set should contain the added element");
        set.add(2);
        assertTrue(set.contains(2), "Set should contain all added elements");
        assertFalse(set.contains(3), "Set should not contain elements that were not added");
    }

    @Test
    @DisplayName("Test case for largest()")
    void testLargest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(3);
        set.add(5);
        set.add(1);
        assertEquals(5, set.largest(), "Largest should be 5");
        
        set.clear();
        set.add(-10);
        set.add(-20);
        set.add(-5);
        assertEquals(-5, set.largest(), "Largest should be -5 in a set of negative numbers");
    }


    @Test
    @DisplayName("Test case for smallest()")
    void testSmallest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(3);
        set.add(5);
        set.add(1);
        assertEquals(1, set.smallest(), "Smallest should be 1");

        set.clear();
        set.add(-10);
        set.add(-20);
        set.add(-5);
        assertEquals(-20, set.smallest(), "Smallest should be -20 in a set of negative numbers");
    }


    @Test
    @DisplayName("Test case for add()")
    void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1), "Set should contain the added element");
        set.add(1);
        assertEquals(1, set.length(), "Adding duplicate should not increase length");
    }

    @Test
    @DisplayName("Test case for remove()")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        System.out.println("Before removal, contains 1: " + set.contains(1)); // Should print true
        set.remove(1);
        System.out.println("After removal, contains 1: " + set.contains(1)); // Should print false
        assertFalse(set.contains(1), "Set should not contain 1 after removal");
    }


    @Test
    @DisplayName("Test case for union()")
    void testUnion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.union(set2);
        assertTrue(set1.contains(1) && set1.contains(2) && set1.contains(3), "Union should contain all unique elements");
    }

    @Test
    @DisplayName("Test case for intersect()")
    void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2), "Intersect should contain common elements only");
        assertFalse(set1.contains(1) || set1.contains(3), "Intersect should not contain non-common elements");
    }

    @Test
    @DisplayName("Test case for diff()")
    void testDiff() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.diff(set2);
        assertTrue(set1.contains(1), "Difference should contain elements unique to the first set");
        assertFalse(set1.contains(2) || set1.contains(3), "Difference should not contain elements of the second set");
    }

    @Test
    @DisplayName("Test case for isEmpty()")
    void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty(), "Newly created set should be empty");
        set.add(1);
        assertFalse(set.isEmpty(), "Set with elements should not be empty");
        set.clear();
        assertTrue(set.isEmpty(), "Cleared set should be empty");
    }

    @Test
    @DisplayName("Test case for toString()")
    void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString(), "toString should return correct string representation");
        set.clear();
        assertEquals("[]", set.toString(), "Empty set should be represented as []");
    }

    @Test
    @DisplayName("Test case for complement()")
    void testComplement() {
        IntegerSet universalSet = new IntegerSet();
        for (int i = 1; i <= 10; i++) {
            universalSet.add(i);  // Universal set contains elements from 1 to 10
        }

        IntegerSet set = new IntegerSet();
        set.add(2);
        set.add(3);
        set.add(5);

        // Complement of `set` with respect to `universalSet`
        set.complement(universalSet);

        // Expected complement should be [1, 4, 6, 7, 8, 9, 10]
        assertTrue(set.contains(1), "Complement should contain 1");
        assertTrue(set.contains(4), "Complement should contain 4");
        assertTrue(set.contains(6), "Complement should contain 6");
        assertTrue(set.contains(7), "Complement should contain 7");
        assertTrue(set.contains(8), "Complement should contain 8");
        assertTrue(set.contains(9), "Complement should contain 9");
        assertTrue(set.contains(10), "Complement should contain 10");

        assertFalse(set.contains(2), "Complement should not contain 2");
        assertFalse(set.contains(3), "Complement should not contain 3");
        assertFalse(set.contains(5), "Complement should not contain 5");

        // Verify that the complement has the expected elements
        assertEquals(7, set.length(), "Complement should have 7 elements");
    }

}

/*
    Reference: ChatGPT
*/