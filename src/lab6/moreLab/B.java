package lab6.moreLab;
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
    <T extends Runnable> void b(A<T> a){
        T t = a.b(1);
        t.run();
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
