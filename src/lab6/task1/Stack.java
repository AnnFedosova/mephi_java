package lab6.task1;

import java.util.ArrayList;

class Stack<E> {
    private ArrayList<E> arrayList;

    Stack(){
        arrayList = new ArrayList<>();
    }

    boolean push(E elem){
        return arrayList.add(elem);
    }

    E pop(){
        return arrayList.get(arrayList.size() - 1);
    }

    boolean isEmpty(){
        return arrayList.isEmpty();
    }

    int length(){
        return arrayList.size();
    }

}
