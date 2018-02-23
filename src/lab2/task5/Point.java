package lab2.task5;

/**
 * Class Point describes a point in the plane.
 * @author Anna
 * @version 1.0
 */
public class Point {
    private double x;
    private double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){ return x;}
    public double getY(){ return y;}

    public Point translate(double a, double b){
        return new Point(x + a, y+ b);
    }
    public Point scale(double a){
        return new Point(x * a, y * a);
    }
    public void printPoint(){
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
    }
}
