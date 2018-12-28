package lab6.morePractice;

import java.util.ArrayList;

public class CheckedOnWriteArrayList<T>{
    private final ArrayList<T> arrayList;
    private final Class<? extends T> clazz;

    public CheckedOnWriteArrayList(ArrayList<T> arrayList, Class<? extends T> clazz){
        this.arrayList = arrayList;
        this.clazz = clazz;
    }

    public T set(int index, T element) throws ClassCastException {
        if (element != null && this.clazz.isAssignableFrom(element.getClass())) {
            return arrayList.set(index, element);
        } else {
            throw new ClassCastException();
        }
    }

    public boolean add(T element) throws ClassCastException {
        if (element != null && this.clazz.isAssignableFrom(element.getClass())) {
            return arrayList.add(element);
        } else {
            throw new ClassCastException();
        }
    }

    public T get(int index){
        return arrayList.get(index);
    }
}
