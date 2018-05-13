package lab4.task3;

/**
 * Make the instance variables x and y of the Point class in Exercise 1 protected.
 * Show that the LabeledPoint class can access these variables only in LabeledPoint instances.
 */
public class Main {
    public static void main(String[] args) {
        LabeledPoint labeledPoint = new LabeledPoint(1,2,"cat");
        System.out.println(labeledPoint.x);

    }
}
