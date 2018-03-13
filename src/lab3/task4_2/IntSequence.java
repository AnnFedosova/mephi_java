package lab3.task4_2;

import java.util.ArrayList;

public interface IntSequence {
    boolean hasNext();
    int next();

    static ArrayList of(int ... numbers){
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (int number : numbers){
            System.out.println(number);
            arrayList.add(number);
        }
        return arrayList;
    }
}
