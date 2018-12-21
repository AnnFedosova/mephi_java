package lab6.task9;

import lab6.task7.Pair;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Arrays<T>{
    ArrayList<T> array;

    //task25
    public static String getSampleString(int a){
        return "Sample String";
    }


    public Arrays() {
        array = new ArrayList<T>();
    }

    boolean add(T elem){
        return array.add(elem);
    }

    public static <E> Pair<E> firstLast(ArrayList<E> a){
        if (a.size() == 0 )
            return null;
        return new Pair<E>(a.get(0), a.get(a.size() - 1));
    }

    //для task9
    public static <E extends Comparable<E>> E min(ArrayList<E> arrayList){
        if (arrayList.size() == 0)
            return null;
        E minElem = arrayList.get(0);
        for (E e : arrayList) {
            if (minElem.compareTo(e) > 0) {
                minElem = e;
            }
        }
        return minElem;
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> arrayList){
        if (arrayList.size() == 0)
            return null;
        E maxElem = arrayList.get(0);
        for (E e : arrayList) {
            if (maxElem.compareTo(e) < 0) {
                maxElem = e;
            }
        }
        return maxElem;
    }

    public static <E extends Comparable<E>> Pair<E> minMax(ArrayList<E> a){
        if (a.size() == 0 )
            return null;
        return new Pair<E>(Arrays.min(a), Arrays.max(a));
    }

    //для task12
    public static <E> void minmax(List<E> elements, Comparator<? super E> comp, List<? super E> result) {
        E minValue = elements.get(0);
        E maxValue = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if (comp.compare(elements.get(i), minValue) < 0) {
                minValue = elements.get(i);
            } else if (comp.compare(elements.get(i), maxValue) > 0) {
                maxValue = elements.get(0);
            }
        }
        result.add(minValue);
        result.add(maxValue);
    }

    //для task13
    public static <T> void maxmin(List<T> elements, Comparator<? super T> comp, List<? super T> result) {
        minmax(elements, comp, result);
        //возник вопрос: что такое Lists
        //Lists.swapHelper(result, 0, 1); //Почему этот метод нельзя скомпилировать без захвата подстановки
        //Lists.<T>swapHelper(result, 0, 1); //попробуйте предоставить явный тип
    }

    //для task 21
    @SafeVarargs
    public static List<String>[] construct(int n, String... strings) {

        List<String>[] lists = (List<String>[]) new Object[n];
        for (List<String> list : lists) {
            for (String string : strings) {
                list.add(string);
            }
        }
        return lists;
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        }

    }
