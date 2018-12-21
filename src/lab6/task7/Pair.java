package lab6.task7;

import lab3.task14.Employee;

public class Pair<E> {
    private E elem1;
    private E elem2;

    public Pair(E e1, E e2){
        elem1 = e1;
        elem2 = e2;
    }

    public E getElem1(){
        return elem1;
    }

    public E getElem2(){
        return elem2;
    }


}
