package lab1.task8;

import java.util.Scanner;
/**
 * Write a program that reads a string and prints all of its nonempty substrings.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str =  sc.nextLine();
        System.out.println("Enter int: ");
        int maxLen =  sc.nextInt();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                if (str.substring(i, j).length() > maxLen)
                    break;
                System.out.println(str.substring(i, j));
            }
        }
    }
}
