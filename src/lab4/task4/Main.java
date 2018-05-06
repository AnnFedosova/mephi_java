package lab4.task4;

/**
 * Define an abstract class Shape with an instance variable of class Point,
 * a constructor, a concrete method public void moveBy(double dx, double dy) that moves the point by the given amount,
 * and an abstract method public Point getCenter().
 *
 * Provide concrete subclasses Circle, Rectangle, Line
 * with constructors public Circle(Point center, double radius),
 * public Rectangle(Point topLeft, double width, double height) and public Line(Point from, Point to).
 */
public class Main {
    public static void main(String[] args) {
        Point O = new Point(0,0);
        Point A = new Point(0,5);

        Circle circle = new Circle(O, 15);
        Circle circle2 = new Circle(A, 10);
        System.out.println("circle Center " + circle.getCenter());
        System.out.println("circle2 Center " + circle2.getCenter());

        Rectangle rectangle = new Rectangle(A, 10, 5);
        System.out.println(rectangle.firstPoint);
        System.out.println("rectangle Center " + rectangle.getCenter());

        Line line = new Line(O, A);
        System.out.println("line Center " + line.getCenter());

    }
}
