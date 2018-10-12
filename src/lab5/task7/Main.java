package lab5.task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**todo
 * Для выполнения этого упражнения вам придется просмотреть исходный код класса java.util.Scanner.
 * Если при использовании класса Scanner операция ввода завершается неудачно,
 * в этом классе перехватывается исключение в связи с ошибками ввода данных и закрывается ресурс,
 * из которого осуществляется ввод.
 * Что произойдет, если при закрытии ресурса будет сгенерировано исключение?
 * Каким образом эта реализация взаимодействует с обработкой подавляемых исключений в операторе try с ресурсами?
 */
public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("C:\\Development\\mephi_java\\src\\lab5\\task7\\testi"));
        } catch (FileNotFoundException e) {
            System.err.println("We have some problem: " + e.getMessage());
        }

    }
}
