package lab6.task25;

import lab6.task9.Arrays;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *  Напишите метод public static String genericDeclaration(Method m),
 *  возвращающий объявление метода m(),
 *  перечисляющего параметры типа с их ограничениями и типами параметров метода,
 *  включая их аргументы типа, если это обобщенные типы.
 */
public class Main {
    public static void main(String[] args) {
        Method method = null;
        Method genericMethod = null;
        Method genericMethod2 = null;

        try {
            method = Arrays.class.getDeclaredMethod("getSampleString", int.class);
            genericMethod = Arrays.class.getDeclaredMethod("firstLast", ArrayList.class );
            genericMethod2 = Arrays.class.getDeclaredMethod("minmax",
                    List.class, Comparator.class, List.class);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        //method.getGenericDeclaration();
        if ( method != null)
            System.out.println("Method is: " + genericDeclaration(method));
        if (genericMethod != null)
            System.out.println("Method is: " + genericDeclaration(genericMethod));
        if (genericMethod2 != null)
            System.out.println("Method is: " + genericDeclaration(genericMethod2));

    }

    private static String genericDeclaration(Method m){
        return m.toGenericString();
    }
}
