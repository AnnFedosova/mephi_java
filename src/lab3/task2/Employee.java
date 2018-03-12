package lab3.task2;

public class Employee implements Measurable {
    private double salary;
    private String name;

    public Employee(double sal, String n){
        salary = sal;
        name = n;
    }
    public double getMeasure() {
        return salary;
    }
    public String getName(){
        return name;
    }

}
