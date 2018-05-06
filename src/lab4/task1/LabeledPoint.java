package lab4.task1;

public class LabeledPoint extends Point {
    String label;
    public LabeledPoint(String label, double x, double y){
        this.label = label;
        this.x = x;
        this.y = y;
    }

    String getLabel(){
        return label;
    }
}
