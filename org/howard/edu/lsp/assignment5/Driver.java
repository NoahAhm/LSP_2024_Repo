package org.howard.edu.lsp.assignment5;

/**
 * Driver class to test IntegerSet class functionality.
 */
public class Driver {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        System.out.println("Set 1: " + set1.toString());
        System.out.println("Smallest value in Set 1: " + set1.smallest());
        System.out.println("Largest value in Set 1: " + set1.largest());
        
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        
        System.out.println("Set 2: " + set2.toString());
        
        // Testing union
        set1.union(set2);
        System.out.println("After union of Set 1 and Set 2: " + set1.toString());
        
        // Testing intersection
        IntegerSet set3 = new IntegerSet();
        set3.add(2);
        set3.add(3);
        set3.add(4);
        set1.intersect(set3);
        System.out.println("After intersection of Set 1 and Set 3: " + set1.toString());
        
        // Testing difference
        set1.diff(set3);
        System.out.println("After difference of Set 1 and Set 3: " + set1.toString());
        
        // Testing isEmpty
        System.out.println("Is Set 1 empty? " + set1.isEmpty());
        
        // Testing clear
        set1.clear();
        System.out.println("After clearing Set 1: " + set1.toString());

        // Testing complement
        IntegerSet universalSet = new IntegerSet();
        for (int i = 1; i <= 10; i++) {
            universalSet.add(i);  // Universal set contains elements from 1 to 10
        }

        System.out.println("Universal Set: " + universalSet.toString());
        
        set1.add(2);
        set1.add(3);
        set1.add(5);
        System.out.println("Set 1 before complement: " + set1.toString());

        set1.complement(universalSet);
        System.out.println("Complement of Set 1 with respect to Universal Set: " + set1.toString());
    }
}
