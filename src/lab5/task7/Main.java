package lab5.task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Для выполнения этого упражнения вам придется просмотреть исходный код класса java.util.Scanner.
 * Если при использовании класса Scanner операция ввода завершается неудачно,
 * в этом классе перехватывается исключение в связи с ошибками ввода данных и закрывается ресурс,
 * из которого осуществляется ввод.
 * Что произойдет, если при закрытии ресурса будет сгенерировано исключение?
 * Каким образом эта реализация взаимодействует с обработкой подавляемых исключений в операторе try с ресурсами?
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Exception e1 = new Exception(" hello");

        //todo проверить выполнение нижних двух строк.
        Exception e2 = new Exception("msg"+e1.getMessage());
        Exception e3 = new Exception("msg",e1);

        //throw e2;
        // будет  Exception in thread "main" java.lang.Exception: msg hello

        //throw e3;
        //будет  Exception in thread "main" java.lang.Exception: msg
        //Caused by: java.lang.Exception:  hello

        //todo из одного файла поток в другой файл. 1 try с ресурсами. 2 try finally
        method2();


    }

    // try с ресурсами
    private static void method1() {
        try (
                Scanner scanner =
                        new Scanner(new File("C:\\Development\\mephi_java\\src\\lab5\\task7\\inFile"));
                PrintWriter printWriter =
                        new PrintWriter(new File("C:\\Development\\mephi_java\\src\\lab5\\task7\\outFile"))
        ) {
            while (scanner.hasNextLine())
                printWriter.write(scanner.nextLine() + "\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //try finally
    private static void method2() {
        Scanner scanner = null;
        PrintWriter printWriter = null;
        try {
            scanner =
                    new Scanner(new File("C:\\Development\\mephi_java\\src\\lab5\\task7\\inFile"));
            printWriter =
                    new PrintWriter(new File("C:\\Development\\mephi_java\\src\\lab5\\task7\\outFile"));
            while (scanner.hasNextLine())
                printWriter.write(scanner.nextLine() + "\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(scanner != null)
                scanner.close();
            if (printWriter != null)
                printWriter.close();
        }
    }
}
