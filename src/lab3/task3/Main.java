package lab3.task3;

import javax.imageio.stream.ImageOutputStream;
import java.util.Scanner;
/**
 *  What are all the supertypes of String? Of Scanner? Of ImageOutputStream?
 *  Note that each type is its own supertype.
 *  A class or interface without declared supertype has supertype Object.
 */
public class Main {
    public static void main(String[] args) {
        //Тест на своих классах
        MySecondClass mySecondClass = new MySecondClass();
        System.out.println(mySecondClass.getClass().getSuperclass());
        //в объявлении:
        //public interface ImageOutputStream extends ImageInputStream, DataOutput {
        //ImageInputStream, DataOutput - суперкласс
        System.out.println(Object.class.getSuperclass());
        System.out.println(Scanner.class.getClass().getSuperclass());
        System.out.println(ImageOutputStream.class.getClass().getSuperclass());

        printSuperClass(String.class.getSuperclass());
    }

    public static void printSuperClass(Class cl){
        Class SubClass = cl;
        System.out.println("supertypes of " + SubClass.getName());
        String str;
        while (true){
            str = SubClass.getSuperclass().toString();
            if (str == null)
                break;
            System.out.println(str);
            SubClass = cl.getClass().getSuperclass();
        }
    }

}
