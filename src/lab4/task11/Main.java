package lab4.task11;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Напишите программу, выводящую сообщение "Hello, World ",
 * воспользовавшись рефлексией для поиска поля out в классе java.lang.System
 * и методом invoke() для вызова метода println().
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //класс с именем System
        Class cl = Class.forName(System.class.getName());
        //из него берем поле с именем out
        Field field = cl.getDeclaredField("out");
        Class printStreamClass = field.getType();
        Object object = field.get(null);

        Method printlnMethod = printStreamClass.getDeclaredMethod("println", String.class);
        printlnMethod.invoke(object, "Hello, world!"); //получим результат работы метода
    }
}
