package lab6.task11;

import java.util.ArrayList;
import static lab6.task9.Arrays.minMax;


/**
 * Продолжая предыдущее упражнение, предоставьте метод minMax(),
 * возвращающий объект типа Pair с наименьшим и наибольшим элементами массива.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrays = new ArrayList<>();
        ArrayList<Integer> integerArrays = new ArrayList<>();

        stringArrays.add("aa");
        stringArrays.add("ab");
        stringArrays.add("zoo");
        stringArrays.add("fgg");

        integerArrays.add(44);
        integerArrays.add(11);
        integerArrays.add(55);
        integerArrays.add(99);

        System.out.println("stringArrays: " + (minMax(stringArrays)).getElem1() +
                " " + (minMax(stringArrays)).getElem2());

        System.out.println("integerArrays: " + (minMax(integerArrays)).getElem1() +
                " " + (minMax(integerArrays)).getElem2());

    }
}
