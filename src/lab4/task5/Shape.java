package lab4.task5;

public abstract class Shape {
    Point firstPoint; //любая (первая) точка фигуры

    Shape(){}
    Shape(Point point){
        firstPoint = point;
    }

    //moveBy moves the point by the given amount
    public void moveBy(double dx, double dy){
        firstPoint.x += dx;
        firstPoint.y += dy;
    }

    public abstract Point getCenter();

    @Override
    public abstract Shape clone();
}
