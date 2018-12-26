package lab6.task3;

import javafx.scene.control.Tab;

/**
 * Реализуйте обобщенный класс Table<K, V>, управляющий списочным массивом,
 * состоящим из элементов типа Entry<K, V>.
 *
 * Предоставьте методы для
 * получения значения, связанного с ключом,
 * установки значения по заданному ключу
 * и удаления ключа.
 */
//todo Показать 2 варианта: 1 - ошибка в рантайм, 2 - ошибка при компиляции
public class Main {
    public static void main(String[] args) {

        TableNoGeneric table1 = new TableNoGeneric();
        table1.add(new EntryNoGeneric(1, 100));
        table1.add(new EntryNoGeneric(2, 200));
        table1.add(new EntryNoGeneric(3 , "300" ));

        int sum = 0;
        for(int i = 0; i < table1.size(); i++){
            sum = sum + (Integer) table1.getValueByNumber(i); //тут ошибка в рантайм
        }
        System.out.println("sum " + sum);

        Table<Integer, Integer> table2 = new Table<>();
        table2.add(new Entry<>(1, 100));
        table2.add(new Entry<>(2, 200));
        //table2.add(new Entry<>(3 , "300"));               //тут на этапе компиляции
    }

    /*task3
    public static void main(String[] args) {
        Table<Integer, String> table1 = new  Table<>();
        System.out.println(table1.add(new Entry<>(11, "cat")));
        System.out.println(table1.add(new Entry<>(22, "cat2")));
        System.out.println(table1.add(new Entry<>(33, "cat3")));
        table1.showTable();

        table1.set(22, "Dog");
        table1.removeByKey(11);
        table1.showTable();

        System.out.println(table1.getValueByKey(11) + " " + table1.getValueByKey(22));
    }*/

/*

Table<Object, Object> Table1 = new Table<>();
        Table1.add(new Entry<>(1, 100));
        Table1.add(new Entry<>(2, 200));
        Table1.add(new Entry<>(3 , "300" ));

        int sum = 0;
        for(int i = 0; i < Table1.size(); i++){
            sum = sum + (Integer) Table1.getValueByNumber(i); //тут ошибка в рантайм
        }
        System.out.println("sum " + sum);



* */


}
