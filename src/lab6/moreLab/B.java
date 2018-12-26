package lab6.moreLab;

import java.util.ArrayList;
import java.util.List;

//todo тут задание с листочка
public class B {

    /*
    void a(A<> a){
        int i = a.a(1);
        sout(i);
    }
    */
    void a(A<?> a){
        int i = a.a(1);
        System.out.println(i);
    }

    /*
    void b(A<> a){
        T t = a.b(1);
        t.run();
    }
     */
    void b(A<? extends Runnable> a){
        Runnable t = a.b(1);
        t.run();
    }

    //<T extends Runnable> void b1(A<T> a){
      //  T t = a.b(1);
        //t.run();
    //}

    //когда нельзя ?, можно только T: когда нужно несколько вх параметров
    //нет ош
    <T extends Runnable> void bNoQuestion2(A<T> a, A<T> a1){
        Runnable t = a.b(1);
        t.run();

        List<A<T>> list = new ArrayList<>();
        list.add(a);
        list.add(a1);
    }


    //есть ош
    void bNoQuestion(A<? extends  Runnable> a, A<? extends  Runnable> a1){
        Runnable t = a.b(1);
        t.run();

        List<A<Runnable>> list = new ArrayList<>();
        //list.add(a);
        //list.add(a1);
    }








    //когда нельзя T, можно только ?: ? поддерживает как верхнюю так и нижнюю границу
    //public <T super Integer> void addOneNo(List<T> list){

    //}

    public void addOne(List<? super Integer> list) {
        list.add(1);
    }

    /*
    void c(A<> a){
        Runnable r = ()->{};
        int i = a.c(r);
    }
    */
    void c(A<? super Runnable> a){
        Runnable r = ()->{/**/};
        int i = a.c(r);
    }

    /*
    d(A<> a, t){
        return a.d(t);
    }
    */
    <T> T d(A<T> a, T t){
        return a.d(t);
    }
}
/*
//нет ош
    <T extends Runnable> void bNoQuestion2(A<T> a, A<T> a1){
        Runnable t = a.b(1);
        t.run();

        List<A<T>> list = new ArrayList<>();
        list.add(a);
        list.add(a1);
    }
    //есть ош
    void bNoQuestion(A<? extends  Runnable> a, A<? extends  Runnable> a1){
        Runnable t = a.b(1);
        t.run();

        List<A<Runnable>> list = new ArrayList<>();
        list.add(a);
        list.add(a1);
    }
*/