package lab6.task1;

/**
 * Реализуйте обобщенный класс Stack<E>, управляющий списочным массивом, состоящим из элементов типа Е.
 * Предоставьте методы push(), рор() и isEmpty().
 */
public class Main {
    public static void main(String[] args) {

        //Элементы в массиве типа String

        Stack<String> stringStack = new Stack<>();

        if (stringStack.push("First is Dog") && stringStack.push("Second is Cat")) {
            System.out.println("Добавили элементы в stringStack!");
        }

        if (!stringStack.isEmpty()) {
            System.out.println("last elem: " + stringStack.pop());
        }

        stringStack.showType();

        //Элементы в массиве типа Integer
        Stack<Integer> integerStack = new Stack<>();

        if (integerStack.push(11) && integerStack.push(22)) {
            System.out.println("Добавили элементы в integerStack!");
        }

        if (!integerStack.isEmpty()) {
            System.out.println("last elem: " + integerStack.pop());
        }
        integerStack.showType();

        //Безопасность с дженериками:
        //stringStack = integerStack;

        ObjectStack stringObjectStack = new ObjectStack();

        if (stringObjectStack.push("First is Dog") && stringObjectStack.push("Second is Cat")) {
            System.out.println("Добавили элементы в stringObjectStack!");
        }

        ObjectStack integerObjectStack = new ObjectStack();

        if (integerObjectStack.push(11) && integerObjectStack.push(22)) {
            System.out.println("Добавили элементы в integerObjectStack!");
        }

        System.out.println(integerObjectStack.pop() );    //ошибка

    }

}
