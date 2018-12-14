package lab6.task19;

import java.util.ArrayList;

/**
 *  Рассмотрите следующий метод, представленный в разделе 6.6.3:
 * public static <Т> ArrayList<T> repeat(int n, T obj)
 * Этот метод без особых хлопот составляет списочный массив типа ArrayList<T> из элементов типа Т.
 * Можно ли получить массив типа Т[] из этого списочного массива, не пользуясь объектом типа Class
 * или ссылкой на конструктор? Если нельзя, то почему?
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = repeat(5, "Cat");
        //int[] mass = new int[10];
        //int[] mass2 = repeat(5, 6).toArray(mass);

        String[] mass2 = arrayList.toArray(new String[arrayList.size()]);
    }

    public static <T> ArrayList<T> repeat(int n, T obj) {
        ArrayList<T> result = new ArrayList<>(); // OK
           for (int i = 0; i < n; i++)
               result.add(obj);
           return result;

    }

    @SuppressWarnings("unchecked")
    public static <T> T[] repeat2(ArrayList<T> arrayList) {

        //return arrayList.toArray(new T[arrayList.size()]); так нельзя тк new T[10]

        return (T[]) arrayList.toArray(new Object[arrayList.size()]);
    }

}

