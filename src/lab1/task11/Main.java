package lab1.task11;

import java.util.Scanner;
/**
 * Write a program that reads a line of text and prints all characters that are not ASCII,
 * together with their Unicode values. Пример: ĕ ¬>>>>>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line: ");
        String str = sc.nextLine();
        System.out.println(str.replaceAll("\\p{ASCII}",""));
    }
}
