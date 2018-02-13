package lab1.task3;
import java.util.Scanner;
import java.math.*;

/**
 * Using only the conditional operator (условные), write a program that reads three integers and prints the largest.
 * Repeat with Math.max.
 */

//№1: с помощью условных операторов
    /*
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 3 integers : \n");
       int max_num = sc.nextInt();
       int num2 = sc.nextInt();
       int num3 = sc.nextInt();
       if(num2 > max_num)
           max_num = num2;
       if (num3 > max_num)
           max_num = num3;
       System.out.print("Max integer: " + max_num);
    }
}
*/
//№2: с помощью Math.max.
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 integers : \n");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.print("Max integer: " + Math.max(Math.max(num1,num2),num3));
    }
}