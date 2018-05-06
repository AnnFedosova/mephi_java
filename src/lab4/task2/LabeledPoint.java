package lab4.task2;

public class LabeledPoint extends Point {
    String label;

    public LabeledPoint(double x, double y, String label){
        super(x, y);
        this.label = label;
    }

    String getLabel(){
        return label;
    }

    @Override
    public String toString() {
        return "x -> " + getX() + ", y ->  " + getY() + ", label -> " + getLabel();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LabeledPoint) {
            LabeledPoint labeledPoint = (LabeledPoint) obj;
            return this.x == labeledPoint.getX() && this.y == labeledPoint.getY()
                    && this.label.equals(labeledPoint.getLabel());
        }
        else return false;
    }

    @Override
    public int hashCode() {
        return (((int) x + (int) y) - 13) * (int) y * 2/((int) x) * 5 / label.length() ;
    }
}
