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

    public static <El> Pair<El> firstLast(ArrayList<El> a){
        if (a.size() == 0 )
            return null;
        return new Pair<El>(a.get(0), a.get(a.size() - 1));
    }
}
