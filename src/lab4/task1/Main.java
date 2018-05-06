package lab4.task1;

/**
 * Define a class Point with a constructor public Point(double x, double y) and accessor methods getX, getY.
 * Define a subclass LabeledPoint with a constructor public LabeledPoint(String label, double x, double y)
 * and an accessor method getLabel.
 */

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5, 6);
        System.out.print(point.x + " " + point.y + "\n");
        LabeledPoint labeledPoint = new LabeledPoint( "yy", 7, 8);
        System.out.println(labeledPoint.getLabel() + labeledPoint.x + labeledPoint.y);
    }
}
