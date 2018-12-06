package lab6.task3;

/**
 * Реализуйте обобщенный класс Table<K, V>, управляющий списочным массивом,
 * состоящим из элементов типа Entry<K, V>.
 *
 * Предоставьте методы для
 * получения значения, связанного с ключом,
 * установки значения по заданному ключу
 * и удаления ключа.
 */
public class Main {
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
    }
}
