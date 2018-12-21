package lab6.task1;

import java.util.ArrayList;

//сдача лабы
public class ObjectStack {
    private ArrayList<Object> arrayList;

    ObjectStack(){
        arrayList = new ArrayList<Object>();
    }

    boolean push(Object elem){
        return arrayList.add(elem);
    }

    Object pop(){
        return arrayList.get(arrayList.size() - 1);
    }
}
