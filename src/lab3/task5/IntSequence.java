package lab3.task5;

import java.util.stream.Stream;

public interface IntSequence {
    static Stream constant(int n){
         return Stream.generate(() -> n); //лямбда выр вызывается каждый раз
    }
}
