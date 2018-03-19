package lab3.task9;

/**
 *  Implement methods
 *  public static void runTogether(Runnable… tasks)
 *  public static void runInOrder(Runnable… tasks)
 *  The first method should run each task in a separate thread and then return.
 *  The second method should run all methods in the current thread and return when the last one has completed.
 */
public class Main {
    public static void main(String[] args) {
        Greeter greeter1 = new Greeter(20, "Tom");
        Greeter greeter2 = new Greeter(20, "Lana");
        Greeter greeter3 = new Greeter(20, "Alice");
        runTogether(greeter1, greeter2, greeter3);
        //runInOrder(greeter1, greeter2, greeter3);

    }

    public static void runTogether(Runnable... tasks) {
        for (Runnable object : tasks) {
            new Thread(object).start();
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable object : tasks) {
            object.run();
        }
    }
}
