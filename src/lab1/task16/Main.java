package lab1.task16;

import java.util.Scanner;

/**
 * Improve the average method so that it is called with at least one parameter.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Average: " + average(a,b));
    }
    private static double average(float x, float y) {return (x + y) / 2;}
}
