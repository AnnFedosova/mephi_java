package lab1.task13;

import java.util.ArrayList;
import java.util.*;


/**
 *  Write a program that prints a lottery combination, picking six distinct numbers between 1 and 49.
 *  To pick six distinct numbers, start with an array list filled with 1 … 49.
 *  Pick a random index and remove the element.
 *  Repeat six times. Print the result in sorted order.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();     //нельзя int тк примитивный тип
        for (int i = 0; i < 49; i++)
            list.add(i+1);
        Random rn = new Random();
        ArrayList<Integer> outList = new ArrayList<Integer>();     //нельзя int тк примитивный тип
        for (int i = 0; i < 6; i++) {
            int num = rn.nextInt(49);
            outList.add(list.get(num));
            list.remove(num);
        }
        Collections.sort(outList);
        System.out.println(outList);
    }
}
