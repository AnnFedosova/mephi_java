package lab6.morePractice;

import java.util.ArrayList;

/**
 * Написать классы-обертки CheckedOnWriteArrayList<T>, CheckedOnReadArrayList<T>
 * <p>
 * Конструкторы обоих принимают ArrayList, Class (должна быть проверка соответствия с помощью generic'ов).
 * <p>
 * У onRead при операциях чтения (get, remove) выполняется проверка типа элемента,
 * выбрасывается исключение, если тип элемента не соответствует типу ArrayList.
 * У OnWrite такая проверка выполняется при записи (методы set, add).
 */
public class Main {
    public static void main(String[] args) throws Exception{
        //CheckedOnReadArrayList<T>

        CheckedOnReadArrayList<Object> list1 = new CheckedOnReadArrayList<>(new ArrayList<Object>(), Number.class);
        boolean a0 = list1.add(11);
        boolean a1 = list1.add(7L);
        //boolean a2 = list.add("String");

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));

        System.out.println(list1.remove(1));

        //CheckedOnWriteArrayList<T>
        CheckedOnWriteArrayList<Object> list2 = new CheckedOnWriteArrayList<>(new ArrayList<Object>(), Integer.class);
        boolean b1 = list2.add(16);
        //boolean b2 = list2.add("90");

        System.out.println(list2.set(0, 99));
        System.out.println(list2.set(0, "87"));



    }
}
