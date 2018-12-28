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

        CheckedOnReadArrayList<Object> list1 =
                new CheckedOnReadArrayList<>(new ArrayList<>(), Integer.class);
        boolean a0 = list1.add(11);
        boolean a2 = list1.add("String");

        System.out.println(list1.get(0));
        //System.out.println(list1.get(1)); // тут ошибка рантайм

        //CheckedOnWriteArrayList<T>
        CheckedOnWriteArrayList<Object> list2 =
                new CheckedOnWriteArrayList<>(new ArrayList<>(), Integer.class);
        boolean b1 = list2.add(1);
        list2.set(0, 99);
        //list2.set(0, "87"); // тут ошибка рантайм

    }
}
