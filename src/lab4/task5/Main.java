package lab4.task5;

/**
 * Define clone methods for the classes of the preceding exercise.
 */
public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(0, 7);
        Point pointB = new Point(3, 18);


        Circle circle1 = new Circle(pointA, 10);
        Circle circle2 = circle1.clone();
        System.out.println(circle2.radius);

        Line line1 = new Line(pointA, pointB);
        Line line2 = line1.clone();
        System.out.println(line2.firstPoint.getX());

        Rectangle rectangle1 = new Rectangle(pointA, 11, 10);
        Rectangle rectangle2 = rectangle1.clone();
        System.out.println(rectangle2.width);
    }
}
