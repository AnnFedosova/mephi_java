package lab6.task5;

import java.util.Arrays;

/** todo проверить
 * Рассмотрите следующий вариант метода swap(), где массив может быть предоставлен с помощью аргументов переменной длины:
 * public static <Т> Т[] swap(int i, int j, T... values) { T temp = values[i];
 * values[i] = values [j]; values[j] = temp; return values;
 * А теперь рассмотрите следующий вызов:
 * Doublet] result = Arrays.swap(0, 1, 1.5, 2, 3);
 * Какое сообщение об ошибке вы получите? Далее сделайте такой вызов:
 * Doublet] result = Arrays.<Double>swap(0, 1, 1.5, 2, 3);
 * Изменилось ли к лучшему сообщение об ошибке? Что нужно сделать для устранения ошибки?
 */
public class Main {
    public static void main(String[] args) {
        //Double result = Main.swap(0, 1, 1.5, 2, 3);
        //Какое сообщение об ошибке вы получите?
        //Error:(17, 34) java: incompatible types:
        // no instance(s) of type variable(s) T exist so that T[] conforms to java.lang.Double
        //нет экземпляра (ов) типа (ов) типа T

        //Double result2 = Main.<Double>swap(0, 1, 1.5, 2.0, 3.0);
        //Изменилось ли к лучшему сообщение об ошибке? нет
        //Error:(23, 43) java: incompatible types:
        // java.lang.Double[] cannot be converted to java.lang.Double

        Double[] result2 = Main.<Double>swap(0, 1, 1.5, 2.0, 3.0);


    }

    //@SafeVarargs
    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }


}
