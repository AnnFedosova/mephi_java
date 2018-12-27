package lab6.morePractice;

import java.util.ArrayList;

public class CheckedOnReadArrayList<T>{
    private final ArrayList<T> arrayList;
    private final Class clazz;

    public CheckedOnReadArrayList(ArrayList<T> arrayList, Class clazz){
        this.arrayList = arrayList;
        this.clazz = clazz;
    }

    public T get(int index) throws Exception {
        T element = arrayList.get(index);
        if (element != null && this.clazz.isAssignableFrom(element.getClass())) {
            return element;
        } else {
            throw new Exception();
        }
    }

    public T remove(int index) throws Exception {
        T element = arrayList.get(index);
        if (element != null && this.clazz.isAssignableFrom(element.getClass())) {
            return arrayList.remove(index);
        } else {
            throw new Exception();
        }
    }

    public boolean add(T e) {
        return arrayList.add(e);
    }




}
