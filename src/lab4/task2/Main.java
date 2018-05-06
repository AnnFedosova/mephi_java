package lab4.task2;

/**
 * Define toString, +
 * equals, +
 * and hashCode +
 * methods for the classes of the preceding exercise.
 */
public class Main {
    public static void main(String[] args) {
        //проверка класса Point
        Point point1 = new Point(7, 1);
        Point point2 = new Point(70, 10);
        Point point3 = new Point(70, 10);

        //1. toString
        System.out.println("point1: " + point1.toString());
        System.out.println("point2: " + point2.toString());
        System.out.println("point3: " + point3.toString());
        //2. equals
        if (point1.equals(point2))
            System.out.println(" point1 equals point2");
        if (point2.equals(point3))
            System.out.println(" point2 equals point3");
        //3. hashCode
        System.out.println("hashCode 1: " + point1.hashCode());
        System.out.println("hashCode 2: " + point2.hashCode());
        System.out.println("hashCode 3: " + point3.hashCode());


        //проверка класса LabeledPoint
        LabeledPoint labeledPoint1 = new LabeledPoint(1, 2, "first point");
        LabeledPoint labeledPoint2 = new LabeledPoint(10, 20, "second point");
        LabeledPoint labeledPoint3 = new LabeledPoint(1, 2, "third point");

        //1. toString
        System.out.println("LabeledPoint1: " + labeledPoint1.toString());
        System.out.println("LabeledPoint2: " + labeledPoint2.toString());
        System.out.println("LabeledPoint3: " + labeledPoint3.toString());
        //2. equals
        if (labeledPoint1.equals(labeledPoint2))
            System.out.println(" labeledPoint1 equals labeledPoint2");
        if (labeledPoint2.equals(labeledPoint3))
            System.out.println(" labeledPoint2 equals labeledPoint3");
        //3. hashCode
        System.out.println("hashCode 1: " + labeledPoint1.hashCode());
        System.out.println("hashCode 2: " + labeledPoint2.hashCode());
        System.out.println("hashCode 3: " + labeledPoint3.hashCode());

    }


}
