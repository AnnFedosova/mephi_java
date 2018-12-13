package lab6.task9;

import lab6.task7.Pair;
import java.util.ArrayList;

public class Arrays<T>{
    ArrayList<T> array;

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
}
