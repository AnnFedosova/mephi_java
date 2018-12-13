package lab6.task15;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Реализуйте метод mар(),
 * получающий списочный массив и объект типа Function<T,R> (см. главу 3)
 * и возвращающий списочный массив, состоящий из результатов применения функции к заданным элементам этого массива.

 * Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R:
 * Имя абстрактного метода  R apply(T t);
 */
public class Main {
    public static void main(String[] args) {
        Function<Integer, String> convertIntToMoney = x-> String.valueOf(x) + " долларов";
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(100);
        integerArrayList.add(200);

        ArrayList<String> stringArrayList = map(integerArrayList, convertIntToMoney);
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));

        }

    }

    static <T, R> ArrayList<R> map(ArrayList<T> arrayList, Function<T,R> function){
        ArrayList<R> resultArrayList = new ArrayList<>();
        for(int i = 0; i < arrayList.size(); i++){
            resultArrayList.add(function.apply(arrayList.get(i)));
        }
        return resultArrayList;
    }
}
