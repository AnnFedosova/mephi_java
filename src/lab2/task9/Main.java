package lab2.task9;

/**
 *  Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves.  +
 *  Provide methods to drive by a given number of miles,        +
 *  to add a given number of gallons to the gas tank,           +
 *  and to get the current distance from the origin and fuel level.     +
 *  Specify the fuel efficiency (in miles/gallons) in the constructor.
 *  Should this be an immutable class? Why or why not?  меняемый класс тк нужно менять его состояния
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car(1);
        car.addFuel(5);
        car.drive(2);
        System.out.println(car.getFuelLevel());
    }
}
