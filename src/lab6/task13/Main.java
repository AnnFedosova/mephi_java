package lab6.task13;

/**
 * С учетом метода из предыдущего упражнения рассмотрите следующий метод:
 * public static <Т> void maxmin(List<T> elements, Comparator<? super T> comp, List<? super T> result)
 * { minmax(elements, comp, result);
 *      Lists.swapHelper(result, 0, 1);
 * }
 *
 * Почему этот метод нельзя скомпилировать без захвата подстановки  wildcard ?
 * Подсказка: попробуйте предоставить явный тип Lists.<__>swapHelper(result, 0, 1).
 */
public class Main {
    public static void main(String[] args) {

    }
}
