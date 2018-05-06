package lab4.task2;

public class Point {
    double x;
    double y;

    Point(){}
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    @Override
    public String toString() {
        return "x -> " + getX() + ", y ->  " + getY();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point point = (Point) obj;
            return this.x == point.getX() && this.y == point.getY();
        }
        else return false;
    }

    @Override
    public int hashCode() {
        return (((int) x + (int) y) - 13) * (int) y * 2/((int) x) ;
    }
}
