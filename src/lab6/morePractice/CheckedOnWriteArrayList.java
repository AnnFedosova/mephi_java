package lab6.morePractice;

import java.util.ArrayList;

public class CheckedOnWriteArrayList<T>{
    private final ArrayList<T> arrayList;
    private final Class clazz;

    public CheckedOnWriteArrayList(ArrayList<T> arrayList, Class clazz){
        this.arrayList = arrayList;
        this.clazz = clazz;
    }

    public T set(int index, T element) throws Exception {
        if (element != null && this.clazz.isAssignableFrom(element.getClass())) {
            return arrayList.set(index, element);
        } else {
            throw new Exception();
        }
    }

    public boolean add(T element) throws Exception {
        if (element != null && this.clazz.isAssignableFrom(element.getClass())) {
            return arrayList.add(element);
        } else {
            throw new Exception();
        }
    }
}
