package lab3.task15;

import java.util.Random;

/**
 * Implement the RandomSequence in Section 3.9.1, “Local Classes,” on p. 122 as a nested class,
 * outside the randomInts method.
 */
public class Main {
    private static Random generator = new Random();

    static class RandomSequence implements IntSequence {
        int low;
        int high;

        public RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }

        public int next() { return low + generator.nextInt(high - low + 1); }
        public boolean hasNext() { return true; }
    }

    public static void main(String[] args) {
        System.out.println(randomInts(1,5).next());
    }

    public static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }
}