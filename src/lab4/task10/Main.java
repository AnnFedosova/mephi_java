package lab4.task10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 *   Use the MethodPrinter program in Section 4.5.1, “Enumerating Class Members,” on p. 160
 *   to enumerate all methods of the int[] class.
 *   Extra credit if you can identify the one method (discussed in this chapter) that is wrongly described.
 *
 *   Воспользуйтесь примером кода из раздела 4.5.1 для перечисления всех методов из класса типа int[ ]
 */
@Deprecated
public class Main {
    public static void main(String[] args) {
        System.out.println(Main.class.getAnnotations().length);

        Class cl = Main.class;
        while (cl != null) {
            System.out.println("--------className------->" + cl.getName() + '\n' + "Methods: ");
            for (Method m : cl.getDeclaredMethods()) {
                System.out.println(
                                Modifier.toString(m.getModifiers()) + " " +
                                m.getReturnType().getCanonicalName() + " " +
                                m.getName() +
                                Arrays.toString(m.getParameters()));
            }
            System.out.println("--------getSuperclass-------");
            cl = cl.getSuperclass();
        }
    }
}