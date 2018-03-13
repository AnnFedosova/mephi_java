package lab3.task5;

/**
 * Implement a static constant method of the IntSequence class that yields an infinite constant sequence.
 * For example, IntSequence.constant(1) yields values 1 1 1 … , ad infinitum.
 * Extra credit if you do this with a lambda expression.
 */
public class Main {
    public static void main(String[] args) {
        IntSequence.constant(1).forEach(System.out::println);
    }
}
