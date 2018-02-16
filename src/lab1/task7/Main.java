package lab1.task7;

import java.util.Scanner;

/**
 * Write a program that reads in two numbers between 0 and 65535,
 * stores them in short variables,
 * and computes their unsigned sum, difference, product (произведение), quotient (отношение),
 * and remainder (остаток), without converting them to int.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int change = 32767;
        short num1 = (short) (sc.nextInt() - change);
        System.out.println("Enter second number: ");
        short num2 = (short) (sc.nextInt() - change);

        System.out.println("Sum: " + (num1+ change + num2 + change));
        System.out.println("Difference: " + (num1 + change - num2 - change));
        System.out.println("Product: " + ((num1 + change)*(num2 + change)));
        System.out.println("Quotient: " + ((num1 + change) / (num2 + change)));
        System.out.println("Remainder: " + ((num1 + change) % (num2 + change)));
    }
}

        /*Integer i = 9 ;//= new Integer();
        if( i instanceof Integer )
            System.out.println("TRUE " + i);*/
