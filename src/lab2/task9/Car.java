package lab2.task9;

/**
 * Class Car models a car traveling along the x-axis, consuming gas as it moves.
 */
public class Car {
    private double x; //расстояние, на которое проехала машина [км]
    private double fuelLevel; //кол-во топлива  [л]
    private double fuelEfficiency; //эффективность использования топлива, коэфф [км/л]

    public Car(){
        x = 0;
        fuelLevel = 0;
        fuelEfficiency = 0;
    }

    public Car(double fEff){
        x = 0;
        fuelLevel = 0;
        fuelEfficiency = fEff;
    }

    public void drive(double distance){
        x += distance;
        fuelLevel -= x/fuelEfficiency;
    }

    public void addFuel(double fuel){
        fuelLevel += fuel;
    }

    public double getX(){
        return x;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

}
