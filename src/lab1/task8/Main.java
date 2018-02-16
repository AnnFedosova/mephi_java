package lab1.task8;

import java.util.Scanner;

/**
 * Write a program that reads a string and prints all of its nonempty substrings.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        while (str.contains("  "))
            str = str.replace("  "," ");
        if (str.startsWith(" "))
            str = str.substring(1);
        if (str.endsWith(" "))
            str=str.substring(0,str.length()-1);
        System.out.println(str.replace(" " , ""));         //печать без пробелов
        for(int i = 0; i < (str.split(" ")).length; i++)              //печать отдельных слов
            System.out.println((str.split(" "))[i]);
    }
}
