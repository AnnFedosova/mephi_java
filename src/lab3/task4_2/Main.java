package lab3.task4_2;

/**
 * Implement a static of method of the IntSequence class that yields a sequence with the arguments.
 * For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a sequence with six values.
 * Extra credit if you return an instance of an anonymous inner class.
 */
public class Main {
    public static void main(String[] args) {
        IntSequence sequence = IntSequence.of(1,2,3,4,5);

        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }
    }
}