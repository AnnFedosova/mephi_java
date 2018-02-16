package lab1.task14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that reads a two-dimensional array of integers and
 * determines whether it is a magic square
 * (that is, whether the sum of all rows, all columns, and the diagonals is the same).
 * Accept lines of input that you break up into individual integers, and stop when the user enters a blank line.
 * For example, with the input
 * 16 3 2 13
 * 5 10 11 8 //опечатка не 3, а 5
 * 9 6 7 12
 * 4 15 14 1
 * (Blank line)
 * your program should respond affirmatively.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<String[]> twoDimArray = new ArrayList<>();
        twoDimArray.add(str.split(" "));
        int n = twoDimArray.get(0).length;   //размерность матрицы
        //System.out.println(n);
        for (int i = 1; i < n; i++){
            str = sc.nextLine();
            if("".equals(str))
                throw new NullPointerException("Wrong number of lines");
            twoDimArray.add(str.split(" "));
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                System.out.print(twoDimArray.get(i)[j] + " ");
            System.out.println();
        }

    }
}
