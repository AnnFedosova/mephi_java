package lab2.task10;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    public static int randomElement(int[] array){
        if (array.length == 0) {
            System.out.println("Empty array.");
            return 0;
        }
        Random rn = new Random();
        int random = rn.nextInt(array.length);
        System.out.println("Random number is: " + random);
        return array[random];
    }

    public static int randomElement(ArrayList list){
        if (list.size() == 0){
            System.out.println("Empty list.");
            return 0;
        }
        Random rn = new Random();
        int random = rn.nextInt(list.size());
        System.out.println("Random number is: " + random);
        return (int) list.get(random);
    }

}
