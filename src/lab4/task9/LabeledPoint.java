package lab4.task9;

public class LabeledPoint extends Point {
    private String label;
    private LabeledPoint point ;
    public static String string = "fffffffff";

    public LabeledPoint(double x, double y, String label, LabeledPoint p) {
        super(x, y);
        this.label = label;
        this.point=p;
    }

    public LabeledPoint getPoint() {
        return point;
    }

    public void setPoint(LabeledPoint point) {
        this.point = point;
    }

    public String getLabel() {
        return label;
    }
}