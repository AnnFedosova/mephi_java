package lab4.task4;

//Прямоугольник
public class Rectangle extends Shape{

    //firstPoint is topLeft
    double width;
    double height;

    public Rectangle(Point topLeft, double width, double height){
        firstPoint = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(firstPoint.getX() + (width/2), firstPoint.getY() - (height/2));
    }
}
