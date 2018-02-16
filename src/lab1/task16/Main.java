package lab1.task16;

/**
 * Improve the average method so that it is called with at least one parameter.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Average: " + average(1,2,3 ));
    }
    //private static float average(float x, float y) {return (x + y) / 2;}
    private static float average(float... values) {
        float sum = 0;
        for (float v : values)
            sum += v;
        return values.length == 0 ? 0 : sum / values.length;
    }
}
