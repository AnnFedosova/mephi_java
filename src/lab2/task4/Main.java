//package lab2.task4;
//
//import org.omg.CORBA.IntHolder;
//import java.util.Scanner;
//
///**
// * Why can’t you implement(сделать) a Java method that swaps the contents of two int variables?
// * (который меняет знач переменных int местами)
// * -> т.к. в метод передается значение переменной, а не ссылка на нее
// * Instead, write a method that swaps the contents of two IntHolder objects.
// * (Look up this rather obscure class in the API documentation.)
// * Can you swap the contents of two Integer objects? -> нет, нельзя менять содержание этого объекта
// */
//
//public class Main {
//    public static void main(String[] args) {
//        IntHolder a = new IntHolder();
//        IntHolder b = new IntHolder();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter value a: ");
//        a.value = sc.nextInt();
//        System.out.println("Enter value b: ");
//        b.value = sc.nextInt();
//        swap(a, b); //меняем местами
//        System.out.println("a: " + a.value);
//        System.out.println("b: " + b.value);
//
//        //Can you swap the contents of two Integer objects?
//        // Integer, Double, Long и прочие реализованы так,
//        // что изменить их содержание без создания нового экземпляра нельзя
//    }
//
//    //write a method that swaps the contents of two IntHolder objects
//    private static void swap(IntHolder a, IntHolder b)
//    {
//        int temp = a.value;
//        a.value = b.value;
//        b.value = temp;
//    }
//}
//
//// Although a and b are copies, they are copies *of a reference*.
//// That means they point at the same object as in the caller,
//// and changes made to the object will be visible in both places.