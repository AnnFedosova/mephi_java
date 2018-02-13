package lab1.task8;

import java.util.Scanner;

/**
 * Write a program that reads a string and prints all of its nonempty substrings.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        //печать без пробелов
        System.out.println(str.replace(" ",""));
        //печать отдельных слов
        for(int i = 0; i < (str.split(" ")).length; i++)
            System.out.println((str.split(" "))[i] + "\n");
    }
}
