package lab4.task5;

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

    public String toString() {
        return "x -> " + getX() + ", y ->  " + getY();
    }

}
