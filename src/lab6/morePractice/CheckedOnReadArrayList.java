package lab6.morePractice;

import java.util.ArrayList;

public class CheckedOnReadArrayList<T>{
    private final ArrayList<T> arrayList;
    private final Class<? extends T> clazz;

    public CheckedOnReadArrayList(ArrayList<T> arrayList, Class<? extends T> clazz){
        this.arrayList = arrayList;
        this.clazz = clazz;
    }

    public T get(int index) throws ClassCastException {
        T element = arrayList.get(index);
        if (element != null && this.clazz.isAssignableFrom(element.getClass())) {
            return element;
        } else {
            throw new ClassCastException();
        }
    }

    public T remove(int index) throws ClassCastException {
        T element = arrayList.get(index);
        if (element != null && this.clazz.isAssignableFrom(element.getClass())) {
            return arrayList.remove(index);
        } else {
            throw new ClassCastException();
        }
    }

    public boolean add(T e) {
        return arrayList.add(e);
    }




}
