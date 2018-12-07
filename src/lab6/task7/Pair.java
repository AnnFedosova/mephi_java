package lab6.task7;

class Pair<E> {
    private E elem1;
    private E elem2;

    Pair(E e1, E e2){
        elem1 = e1;
        elem2 = e2;
    }

    E getElem1(){
        return elem1;
    }

    E getElem2(){
        return elem2;
    }
}
