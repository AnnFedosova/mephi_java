package lab4.task5;

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

    @Override
    public Circle clone() {
        return new Circle(firstPoint, radius);
    }
}
