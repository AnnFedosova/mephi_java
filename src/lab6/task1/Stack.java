package lab6.task1;

import java.util.ArrayList;

class Stack<E> {
    private ArrayList<E> arrayList;

    Stack(){
        arrayList = new ArrayList<E>();
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

    void showType(){
        if (!this.isEmpty()) {
            System.out.println("Type <E> is " + this.pop().getClass().getName());
        }
        else {
            System.out.println("Stack is empty");
        }

    }

}
