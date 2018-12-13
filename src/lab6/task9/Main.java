package lab6.task9;

import java.util.ArrayList;

import static lab6.task9.Arrays.firstLast;

/**
 * Предоставьте в служебном классе Arrays следующий метод,
 * возвращающий пару, состоящую из первого и последнего элементов массива а, указав подходящий аргумент типа:
 * public static <Е> Pair<E> firstLast(ArrayList<__> a)
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrays = new ArrayList<>();
        ArrayList<Integer> integerArrays = new ArrayList<>();

        stringArrays.add("first");
        stringArrays.add("second");
        stringArrays.add("third");
        stringArrays.add("fourth");

        integerArrays.add(11);
        integerArrays.add(12);
        integerArrays.add(13);
        integerArrays.add(14);

        System.out.println("stringArrays: " + (firstLast(stringArrays)).getElem1() +
                " " + (firstLast(stringArrays)).getElem2());

        System.out.println("integerArrays: " + (firstLast(integerArrays)).getElem1() +
                " " + (firstLast(integerArrays)).getElem2());


    }
}
