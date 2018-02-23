package lab2.task6;

/**
 * Class Point describes a point in the plane.
 * @author Anna
 * @version 1.1
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
        this.x += a;
        this.y += b;
        return this;
    }
    public Point scale(double a){
        this.x = this.x * a;
        this.y = this.y * a;
        return this;
    }
    public void printPoint(){
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
    }
}
