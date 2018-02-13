package lab1.task10;

import java.util.Random;
/**
 * Write a program that produces a random string of letters and digits by generating a random long value
 * and printing it in base 36.
 */
public class Main {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rn = new Random();
        int n = 8;
        for (int i = 0; i <= n; i++) {
            System.out.print(str.charAt((Math.abs((int) rn.nextLong()))%36));
        }
    }
}
