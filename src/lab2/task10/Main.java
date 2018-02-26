package lab2.task10;

import java.util.ArrayList;

/**
 * In the RandomNumbers class, provide two static methods randomElement
 * that get a random element from an array or array list of integers.
 * (Return zero if the array or array list is empty.)
 * Why couldn’t you make these methods into instance methods of int[] or ArrayList<Integer>?
 */
public class Main {
    public static void main(String[] args) {
        //with array of integers
        int[] array = {8, 4, 12};
        System.out.println("Your int: " + RandomNumbers.randomElement(array));

        //with array list of integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(15);
        list.add(9);
        System.out.println("Your int: " + RandomNumbers.randomElement(list));

    }
}
