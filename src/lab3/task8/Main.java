package lab3.task8;

/**
 *  Implement a class Greeter that implements Runnable and whose run method prints n copies
 *  of "Hello, " + target, where n and target are set in the constructor.
 *  Construct two instances with different messages and execute them concurrently in two threads.
 */
public class Main {
    public static void main(String[] args) {
        Greeter greeter1 = new Greeter(100, "Tom");
        Greeter greeter2 = new Greeter(100, "Lana");

        Thread thread1 = new Thread(greeter1);
        Thread thread2 = new Thread(greeter2);

        thread1.start();
        thread2.start();
    }
}
