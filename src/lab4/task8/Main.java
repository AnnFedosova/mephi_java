package lab4.task8;

import java.util.HashMap;

/**
 * The Class class has 6 methods that yield a string representation of the type represented by the Class object.
 * How do they differ when applied to arrays, generic types, inner classes, and primitive types?
 *  В классе Class имеются 6 методов, возвращающих строковое представление типа, описываемого объектом типа Class.
 *  Чем отличается их применение к массивам, обобщенным типам, внутренним классам и примитивным типам?
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        //TODO уточнить вывод для массива, что можно, кроме  HashMap
        System.out.println("Array:");
        System.out.println("getCanonicalName = " + arr.getClass().getCanonicalName());
        System.out.println("getSimpleName = " + arr.getClass().getSimpleName());
        System.out.println("getTypeName = " + arr.getClass().getTypeName());
        System.out.println("getName = " + arr.getClass().getName());
        System.out.println("toString = " + arr.getClass().toString());
        System.out.println("toGenericString = " + arr.getClass().toGenericString());
        System.out.println();
        System.out.println("Class:");
        System.out.println("getCanonicalName = " + String.class.getCanonicalName());
        System.out.println("getSimpleName = " + String.class.getSimpleName());
        System.out.println("getTypeName = " + String.class.getTypeName());
        System.out.println("getName = " + String.class.getName());
        System.out.println("toString = " + String.class.toString());
        System.out.println("toGenericString = " + String.class.toGenericString());
        System.out.println();
        System.out.println("Primitive:");
        System.out.println("getCanonicalName = " + int.class.getCanonicalName());
        System.out.println("getSimpleName = " + int.class.getSimpleName());
        System.out.println("getTypeName = " + int.class.getTypeName());
        System.out.println("getName = " + int.class.getName());
        System.out.println("toString = " + int.class.toString());
        System.out.println("toGenericString = " + int.class.toGenericString());
        System.out.println();
        System.out.println("Inner class:");
        System.out.println("getCanonicalName = " + HashMap.SimpleEntry.class.getCanonicalName());
        System.out.println("getSimpleName = " + HashMap.SimpleEntry.class.getSimpleName());
        System.out.println("getTypeName = " + HashMap.SimpleEntry.class.getTypeName());
        System.out.println("getName = " + HashMap.SimpleEntry.class.getName());
        System.out.println("toString = " + HashMap.SimpleEntry.class.toString());
        System.out.println("toGenericString = " + HashMap.SimpleEntry.class.toGenericString());

    }
}
