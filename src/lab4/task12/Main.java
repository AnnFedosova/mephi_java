package lab4.task12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Определите отличие в производительносги обычного вызова метода от его вызова через рефлексию.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int n = 10_000_000;

        WithReflection(n);
        WithoutReflection(n);

    }

    private static void WithReflection(int n) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> clazz = Math.class;
        Method method = clazz.getMethod("sqrt", double.class);
        System.out.println("With reflection");
        long before = System.nanoTime();
        Object value = null;
        for (int i = 0; i < n; i++) {
            value = method.invoke(null, 91); //todo почему  null, в каких случаях нет. обобщить
        }
        System.out.println("Value = " + value);
        long after = System.nanoTime();
        System.out.println((after - before) / n + " ns");
        System.out.println("End");
    }

    private static void WithoutReflection(int n) {
        System.out.println("Without reflection");
        long before = System.nanoTime();
        double value = 0;
        for (int i = 0; i < n; i++) {
            value = Math.sqrt(91);
        }
        System.out.println("Value = " + value);
        long after = System.nanoTime();
        System.out.println((after - before) / n + " ns");
        System.out.println("End");
    }
}
