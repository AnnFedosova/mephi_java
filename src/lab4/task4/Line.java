package lab4.task4;

public class Line extends Shape {

    //firstPoint is fromPoint
    Point toPoint;

    public Line(Point from, Point to){
        firstPoint = from;
        toPoint = to;
    }

    @Override
    public Point getCenter() {
        return new Point((toPoint.getX() - firstPoint.getX())/2, (toPoint.getY() - firstPoint.getY())/2);
    }
}
