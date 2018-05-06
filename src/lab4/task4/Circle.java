package lab4.task4;

public class Circle extends Shape {
    double radius;

    public Circle(Point center, double radius){
        firstPoint = center;
        this.radius = radius;
    }

    @Override
    public Point getCenter(){
        return firstPoint;
    }
}
