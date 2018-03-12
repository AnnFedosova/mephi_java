package lab3.task1;

/**
 *  Provide an interface Measurable with a method double getMeasure() that measures an object in some way.
 *  Make Employee implement Measurable.
 *  Provide a method double average(Measurable[] objects) that computes the average measure.
 *  Use it to compute the average salary of an array of employees.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee0 = new Employee(20000);
        Employee employee1 = new Employee(40000);
        Employee employee2 = new Employee(30000);

        Employee[] empArray = new Employee[3];
        empArray[0] = employee0;
        empArray[1] = employee1;
        empArray[2] = employee2;

        System.out.println(Employee.average(empArray));

    }
}
