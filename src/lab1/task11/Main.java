package lab1.task11;

import java.util.Scanner;
/**
 * Write a program that reads a line of text and prints all characters that are not ASCII,
 * together with their Unicode values. Пример: ĕ ¬
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line: ");
        String str = sc.nextLine();
        String newStr = str.replaceAll("\\p{ASCII}","");
        System.out.println(newStr);
        if (!"".equals(newStr)){
            for(int i = 0; i < newStr.length(); i++)
                System.out.println(str.toCharArray()[i] + " --> " + (int) str.toCharArray()[i]);
        }
    }
}
