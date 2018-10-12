package lab5.task10;

import java.util.Scanner;

/**
 * Напишите рекурсивный метод factorial(), выводящий все кадры стека перед возвратом значения.
 * Постройте (но не генерируйте) объект исключения любого типа
 * и получите результат трассировки его стека, как пояснялось в разделе 5.1.8.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {System.out.println("Answer is " + factorial(scanner.nextInt()));
        }catch (java.util.InputMismatchException e){
            e.printStackTrace();
        }

    }

    static int factorial(int inputValue){
        int res = -1;
        if (inputValue == 0|| inputValue == 1) {
            System.out.println(inputValue);
            return 1;
        }

        res = inputValue*factorial(inputValue-1);
        System.out.println(res);

        return res;
    }
}
