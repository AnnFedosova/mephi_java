package lab1.task4;
/**
 * Write a program that prints the smallest and largest positive double value.
 * Hint: Look up Math.nextUp in the Java API.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Smallest: " + Math.nextUp((double) 0) + "\nLargest: " + Double.MAX_VALUE );
    }
}
