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
        System.out.println("Enter square:");
        String str = sc.nextLine();
        if (str.isEmpty()) throw new NullPointerException("Empty Array");
        ArrayList<String[]> twoDimArray = new ArrayList<>();
        twoDimArray.add(str.split(" "));
        int n = twoDimArray.get(0).length;   //размерность матрицы
        //System.out.println(n);
        for (int i = 1; i < n; i++) {
            str = sc.nextLine();
            if ("".equals(str))
                throw new NullPointerException("Wrong number of lines");
            twoDimArray.add(str.split(" "));
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(twoDimArray.get(i)[j] + " ");
            System.out.println();
        }
        //проверка на магичность
        // находим магическое число для сумм
        int magicSum = 0;
        for (int j = 0; j < n; j++)
            magicSum += Integer.parseInt(twoDimArray.get(0)[j]);
        System.out.println("Possible magic number is " + magicSum);
        boolean magicFlag = true;
        //1. строки
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                sum += Integer.parseInt(twoDimArray.get(i)[j]);
            if (sum != magicSum) {
                magicFlag = false;
                break;
            }
        }
        //2. столбы
        if(magicFlag){
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++)
                    sum += Integer.parseInt(twoDimArray.get(j)[i]);
                if (sum != magicSum) {
                    magicFlag = false;
                    break;
                }
            }
        }
        //3. диагонали
        if(magicFlag) {
            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += Integer.parseInt(twoDimArray.get(i)[i]);
            if (sum != magicSum)
                magicFlag = false;
        }
        if (magicFlag){
            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += Integer.parseInt(twoDimArray.get(i)[n - 1 - i]);
            if (sum != magicSum)
                magicFlag = false;
        }
        System.out.println((magicFlag) ? "Magic!" : "No magic!");
    }
}
