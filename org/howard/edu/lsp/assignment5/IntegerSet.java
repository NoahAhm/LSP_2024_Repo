package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A class representing a set of integers with various set operations.
 * Implements methods for adding, removing, and performing set operations like union, intersection, etc.
 */
public class IntegerSet  {
	// Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
    /**
     * Default constructor
     */
	public IntegerSet() {
	}

	// Constructor if you want to pass in already initialized
    /**
     * Constructor to initialize the set with given elements
     * 
     * @param set List of integers to initialize the set
     */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set. 5 pts.
    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    };

    // Returns the length of the set. 5 pts.
    /**
     * Returns the length of the set.
     * 
     * @return the size of the set
     */
    public int length() {
        return set.size();
    }; // returns the length

    /*
                * Returns true if the 2 sets are equal, false otherwise;
    * Two sets are equal if they contain all of the same values in ANY order.  This overrides
    * the equal method from the Object class. 10 pts.
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet otherSet = (IntegerSet) o;
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
    }; 

    // Returns true if the set contains the value, otherwise false. 5 pts.
    /**
     * Checks if the set contains a specific value.
     * 
     * @param value the value to check
     * @return true if the value is in the set, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    };    
    // Returns the largest item in the set. 5 pts.
    /**
     * Returns the largest element in the set.
     * 
     * @return the largest element
     */
    public int largest()  {
        if (set.size() == 0) throw new RuntimeException("Set is empty");
        return Collections.max(set);

    }; 

    // Returns the smallest item in the set. 5 pts.
    /**
     * Returns the smallest element in the set.
     * 
     * @return the smallest element
     */
    public int smallest()  {
        if (set.size() == 0) throw new RuntimeException("Set is empty");
        return Collections.min(set);
    };

        // Adds an item to the set or does nothing it already there. 5 pts.	
    /**
     * Adds an item to the set. Does nothing if the item is already present.
     * 
     * @param item the item to add
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    } // adds item to the set or does nothing if it is in set

        // Removes an item from the set or does nothing if not there. 5 pts.
    /**
     * Removes an item from the set. Does nothing if the item is not present.
     * 
     * @param item the item to remove
     */
    public void remove(int item) {
        if (set.contains(item)){
            set.remove(item);
        }
    }; 

    // Set union. 11 pts.
    /**
     * Performs union of this set with another set.
     * 
     * @param intSetb the other set to union with
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            this.add(item);
        }
    };

    // Set intersection, all elements in s1 and s2. 12 pts.
    /**
     * Performs intersection of this set with another set.
     * 
     * @param intSetb the other set to intersect with
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }; 

    // Set difference, i.e., s1 –s2. 12 pts.
    /**
     * Performs the set difference, i.e., this set minus the other set.
     * 
     * @param intSetb the other set to subtract
     */
    public void diff(IntegerSet intSetb){
        set.removeAll(intSetb.set);
    } // set difference, i.e. s1 - s2

    // Set complement, all elements not in s1. 11 pts.
    /**
     * Performs the set complement, i.e., all elements not in this set.
     * 
     * @param intSetb the universal set to compare with
     */
    public void complement(IntegerSet universalSet) {
        List<Integer> complementSet = new ArrayList<>(universalSet.set);
        complementSet.removeAll(this.set);
        this.set = complementSet;
    }

    // Returns true if the set is empty, false otherwise. 5 pts.
    /**
     * Checks if the set is empty.
     * 
     * @return true if the set is empty, false otherwise
     */
    boolean isEmpty(){
        return set.isEmpty();
    }; 

    // Return String representation of your set.  This overrides the equal method from 
    // the Object class. 5 pts.
    /**
     * Returns a string representation of the set.
     * 
     * @return string representation of the set
     */
    @Override
    public String toString() {
        return set.toString();
    };	// return String representation of your set
}
