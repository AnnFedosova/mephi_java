package lab6.Сov;

import java.util.ArrayList;
import java.util.List;

/**
 * todo тут Ковариантность и рантайм ошибка
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Manager> managers = new ArrayList<>();
        managers.add(new Manager());
        managers.add(new Manager());
        ArrayList<Employee> employees = new ArrayList<>();  // Integer extends Number
        //employees = managers;

        Manager[] managers1 = new Manager[]{new Manager()};
        Employee[] employees1 = new Employee[]{new Employee()};
        employees1 = managers1;
        employees1[0] = new Employee();


    }
}
