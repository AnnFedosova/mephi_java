package lab3.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Implement the method void luckySort(ArrayList<String> strings, Comparator<String> comp)
 * that keeps calling Collections.shuffle on the array list until the elements are in increasing order,
 * as determined by the comparator.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Cat");
        strings.add("Aggghhtrhrf");
        strings.add("Lana");
        strings.add("Timmy");
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        System.out.println("Before luckySort: " + strings);
        luckySort(strings, comp);
        System.out.println("After luckySort: " + strings);

    }

    public static void luckySort(ArrayList<String> strings, Comparator<String> comp){
        boolean flag = true;
        if (strings.size() == 1)
            return;
        while (flag){
            Collections.shuffle(strings);
            for (int i = 0; i < strings.size() - 1; i++) {
                if (comp.compare(strings.get(i), strings.get(i+1)) >= 0) {
                    flag = false;
                    break;
                }
            }
        }

    }
}

  /*  В интерфейсе Comparator объявлено два метода compare(Object obj1, Object obj2) и equals(Object obj).
   * compare упорядочивает объекты класса,
   * Основным отличием интерфейса Comparator от Comparable является то,
   * что вы можете создавать несколько видов независимых сортировок.
  */