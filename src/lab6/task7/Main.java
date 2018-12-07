package lab6.task7;

/**
 * Реализуйте обобщенный класс Pair<E>, позволяющий сохранять пару элементов типа Е.
 * Предоставьте методы доступа для получения первого и второго элементов.
 */
public class Main {
    public static void main(String[] args) {
        Pair<String> stringPair = new Pair<>("cat", "dog");
        System.out.println("stringPair: " + stringPair.getElem1() + " " + stringPair.getElem2());

        Pair<Integer> integerPair = new Pair<>(12, 13);
        System.out.println("integerPair: " + integerPair.getElem1() + " " + integerPair.getElem2());

    }
}
