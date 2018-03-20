package lab3.task14;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Write a call to Arrays.sort that sorts employees by salary, breaking ties by name.
 * Use Comparator.thenComparing. Then do this in reverse order.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "employee1");
        Employee employee2 = new Employee(5, "employee2");
        Employee employee3 = new Employee(3, "employee3");
        Employee employee31 = new Employee(3, "employee31");
        Employee employee4 = new Employee(1, "employee4");

        Employee[] employees = {employee4, employee31, employee3, employee2, employee1};

        Comparator<Employee> comparator1 =
                Comparator.comparing(Employee::getMeasure).thenComparing(Comparator.comparing(Employee::getName));

        Arrays.sort(employees, comparator1);
        System.out.println("Sort measure then name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Comparator<Employee> comparator2 = Comparator.comparing(Employee::getName).thenComparing(Comparator.comparing(Employee::getMeasure));

        Arrays.sort(employees, comparator2);
        System.out.println("\nSort name then measure:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}