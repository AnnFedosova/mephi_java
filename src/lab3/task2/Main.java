package lab3.task2;

/**
 *  Continue with the preceding exercise and provide a method Measurable largest(Measurable[] objects).
 *  Use it to find the name of the employee with the largest salary. Why do you need a cast?
 */
public class Main {
    public static void main(String[] args) {
        Employee employee0 = new Employee(20000, "Tom");
        Employee employee1 = new Employee(40000, "Tim");
        Employee employee2 = new Employee(300000, "Lana");

        Employee[] empArray = new Employee[3];
        empArray[0] = employee0;
        empArray[1] = employee1;
        empArray[2] = employee2;

        System.out.println(((Employee) Measurable.largest(empArray)).getName());
        //нужно преобразование из супертипа
    }
}
