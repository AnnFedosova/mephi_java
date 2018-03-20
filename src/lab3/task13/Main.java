package lab3.task13;

/**
 * Write a method that takes an array of Runnable instances and returns a Runnable whose run method executes
 * them in order. Return a lambda expression.
 */
public class Main {
    public static void main(String[] args) {
        Runnable[] runnables = {new Rnbl(), new Rnbl(), new Rnbl(), new Rnbl(), new Rnbl(), new Rnbl(), new Rnbl()};
        Runnable runnable = createRunnable(runnables);
        runnable.run();
    }

    private static Runnable createRunnable(Runnable[] runnables) {
        return () -> {
            for (Runnable runnable : runnables) {
                runnable.run();
            }
        };
    }
}