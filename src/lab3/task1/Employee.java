package lab3.task1;

public class Employee implements Measurable{
    private double salary;

    Employee(double sal){
        salary = sal;
    }

    public double getMeasure() {
        return salary;
    }
    static double average(Measurable[] objects){
        double len = objects.length;
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum/len;
    }
}
