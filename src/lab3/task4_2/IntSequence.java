package lab3.task4_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface IntSequence {
    boolean hasNext();
    int next();

    static IntSequence of(int ...numbers) {
        return new IntSequence() {
            private List<Integer> list = new ArrayList<>();
            Iterator<Integer> iterator;

            {
                for (int number : numbers) {
                    list.add(number);
                }
                iterator = list.iterator();
            }

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public int next() {
                return iterator.next();
            }

            @Override
            public String toString() {
                return list.toString();
            }
        };
    }
}