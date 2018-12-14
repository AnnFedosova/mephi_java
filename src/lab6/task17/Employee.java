package lab6.task17;

public class Employee implements Comparable<Employee> {
    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
//  В командной строке:
//    C:\Development\mephi_java\out\production\mephi_java\lab6\task17>javap Employee.class
//    Compiled from "Employee.java"
//    public class lab6.task17.Employee implements java.lang.Comparable<lab6.task17.Employee> {
//    public lab6.task17.Employee();
//    public int compareTo(lab6.task17.Employee);
//    public int compareTo(java.lang.Object);
//    }