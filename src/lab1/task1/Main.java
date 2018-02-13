package lab1.task1;
import java.util.Scanner;

/**
 *  Write a program that reads an integer and prints it in binary, octal, and hexadecimal.
 *  Print the reciprocal as a hexadecimal floating-point number.
*/

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        int num = sc.nextInt();
        System.out.print("binary: " + Integer.toBinaryString(num) +
                         "\noctal: " + Integer.toOctalString(num) +
                         "\nhexadecimal: " + Integer.toHexString(num) + '\n'
                        );
        System.out.println("float: " + Float.toHexString((float) 1/num));
    }
}
