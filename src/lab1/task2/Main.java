package lab1.task2;
import java.util.Scanner;
import java.lang.Math;
/**
 * Write a program that reads an integer angle (угол) (which may be positive or negative)
 * and normalizes it to a value between 0 and 359 degrees.
 * Try it first with the % operator, then with floorMod.
 */

//№1: С использованием %

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle : ");
        int ang = sc.nextInt();
        if (ang >= 0)
            System.out.print("Normal angle : " + ang % 360);
        else
            System.out.print("Normal angle : " + (360 + (ang % 360)));
    }
}

//№2: С использованием Math.floorMod
    /*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle : ");
        int ang = sc.nextInt();
        System.out.print("Normal angle : " + Math.floorMod(ang, 360));
    }
}
*/
