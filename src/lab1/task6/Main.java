package lab1.task6;

import java.math.BigInteger;

/**
 * Write a program that computes the factorial n! = 1 × 2 × … × n, using BigInteger (любая точность).
 * Compute the factorial of 1000.
 */
public class Main {
    public static void main(String[] args) {
        BigInteger res = BigInteger.valueOf(1);
        int n = 1000;
        //if (n == 0)
        //res = BigInteger.valueOf(1);
        for(int i = 1; i <= n; i++){
            res = res.multiply(BigInteger.valueOf(i));
            System.out.print("Calculate... " + res + "\n");
        }
        System.out.print("Answer: " + res);
    }
}
