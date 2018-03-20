package lab3.task13;

public class Rnbl implements Runnable {
    private static int i = 0;

    @Override
    public void run() {
        System.out.println(i);
        i++;
    }
}