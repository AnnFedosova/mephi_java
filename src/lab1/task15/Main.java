package lab1.task15;

import java.util.*;


/**
 * Write a program that stores Pascal’s triangle up to a given n in an ArrayList<ArrayList<Integer>>.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() - 1;   //кол-во уровней треугольника
        ArrayList<ArrayList<Integer>> trangle = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ArrayList<Integer> level = new ArrayList<>();
            level.clear();
            for (int j = 0; j <= i; j++)
                level.add(factorial(i) / (factorial(j) * factorial(i - j)));
            System.out.println(level);
            trangle.add(level);
            }
        for (int i = 0; i < trangle.size(); i++) {
            System.out.println(trangle.get(i));
        }
    }
    private static int factorial(int a){
        if (a == 0)
            return 1;
        int res = 1;
        for (int i = 1; i <= a; i++)
            res = res * i;
        return res;
    }
}
