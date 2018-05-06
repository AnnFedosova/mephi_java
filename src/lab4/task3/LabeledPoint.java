package lab4.task3;

public class LabeledPoint extends Point {
    String label;
    public LabeledPoint(double x, double y, String label){
        super(x, y);
        this.label = label;
    }
    String getLabel(){
        return label;
    }
}
