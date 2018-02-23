package lab2.task6;

/**
 * Repeat the preceding exercise, but now make translate and scale into mutators.
 * @author Anna
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        //should set p to a point with coordinates (2, 3.5).
        p.printPoint();
    }
}
