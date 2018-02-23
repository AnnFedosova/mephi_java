package lab2.task2;

import java.util.Random;
import java.util.Scanner;

/**
 * Consider the nextInt method of the Scanner class.
 * Is it an accessor or mutator?
 * Why? What about the nextInt method of the Random class?
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();       //метод nextInt() - аксессор тк не меняет состояние класса sc (это как get)
        Random random = new Random();
        int b = random.nextInt();   //аксессор тк не меняет состояние класса random
        System.out.println(String.valueOf(a) + " " + String.valueOf(b));
    }
}