package lab6.moreLab;

/**
 * тут классы с листочка
 */

public class Main {
    public static void main(String[] args) {
        A<Integer> a = new A<>();
        B b = new B();
        b.a(a);

        MyRunnable1 myRunnable1 = null;
        MyRunnable2 myRunnable2 = null;

        //b.bNoQuestion2(myRunnable1, myRunnable2);

    }


    public class MyRunnable1 implements Runnable {
        int x;
        public void run() {
            //Code
        }
        MyRunnable1(){};
    }

    public class MyRunnable2 implements Runnable {
        int y;
        public void run() {
            //Code
        }
        MyRunnable2(){};
    }

}

