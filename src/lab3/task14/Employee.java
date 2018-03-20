package lab3.task14;

public class Employee {
    private double measure;
    private String name;

    public Employee(double measure, String name) {
        this.measure = measure;
        this.name = name;
    }

    public double getMeasure() {
        return measure;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: "+name+" | Measure: "+measure;
    }
}