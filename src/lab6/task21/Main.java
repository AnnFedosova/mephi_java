package lab6.task21;

import lab6.task9.Arrays;

import java.util.List;

/**
 *  Используя аннотацию @SafeVarargs, напишите метод, позволяющий строить массивы обобщенных типов,
 *  как в следующем примере:
 * List<String>[] result = Arrays.<List<String>>construct(10) ;

 */
public class Main {
    public static void main(String[] args) {
        //см task9 Arrays
        List<String>[] result = Arrays.<List<String>>construct(10);
    }


}
