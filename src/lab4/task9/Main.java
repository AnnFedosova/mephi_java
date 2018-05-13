package lab4.task9;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Write a “universal” toString method that uses reflection to yield a string with all instance variables of an object.
 * Extra credit if you can handle cyclic references.
 *
 * Напишите универсальный toString(), в котором применяется рефлексия для получения символьной строки
 * со всеми переменными экземпляра объекта.
 * В качестве дополнительного задания можете организовать обработку циклических ссылок.
 */
public class Main {
    private static Object startPoint = null;

    public static void main(String[] args) throws IllegalAccessException {
        LabeledPoint a = new LabeledPoint(1, 2, "a",null);
        LabeledPoint b = new LabeledPoint(1,2,"b",a);
        LabeledPoint c = new LabeledPoint(1,2,"c",b);
        a.setPoint(c);
        System.out.println(Main.toString(a));
    }

    public static String toString(Object object) throws IllegalAccessException {
        if (startPoint == null) { //объект, для которого изначально вызываем метод. Против зацикливания
            startPoint = object;
        }
        else if (startPoint == object) {
            startPoint = null;
            return "";
        }
        Class<?> currentClass = object.getClass();
        StringBuilder string = new StringBuilder(""); // как просто string, но не создается новый объект, а меняется этот
        do {
            //string.append(currentClass.getName()).append(":\n");
            for (Field field : currentClass.getDeclaredFields()) {
                field.setAccessible(true); // доступ
                if (!Modifier.isStatic(field.getModifiers())) {
                    Object value = field.get(object); // брать только поля объекта, не только статик класса
                    if (value != null) {
                        if (!currentClass.isInstance(value)) { //тип класса такой же-> цикл
                            string.append(field.getName()).append(" = ").append(value).append(";\n");
                        } else {
                            string.append(toString(value));
                        }
                    }
                }

            }
            currentClass = currentClass.getSuperclass();
        }
        while (currentClass.getSuperclass() != null);
        return string.toString();
    }
}
