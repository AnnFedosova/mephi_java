package lab1.task9;

import java.util.Scanner;

/**
 * Section 1.5.3, “String Comparison,” on p. 21 has an example of two strings s and t so that s.equals(t) but s != t.
 * Come up with a different example that doesn’t use substring).
 * location == “World” - true only if location and "World" are the same object in memory.
 * location.equals(“World”) - true если строки совпадают
 */
public class Main {
    public static void main(String[] args) {
        String a1 = "str";
        String b1 = "str";
        if(a1 == b1)
            System.out.println("1. The same");
        if (a1.equals(b1))
            System.out.println("1. Eqals");
        String a2 = new String("str");
        String b2 = new String("str");
        if(a2 == b2)
            System.out.println("2. The same");
        if (a2.equals(b2))
            System.out.println("2. Eqals");

    }

}
