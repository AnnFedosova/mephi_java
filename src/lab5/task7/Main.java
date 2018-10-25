package lab5.task7;

import java.io.*;
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
        //из приватного метода выкинуть e1
        Exception e2 = new Exception("msg"+e1.getMessage());
        Exception e3 = new Exception("msg",e1);

        //getExampleException(e1);


        //throw e2;
        // будет  Exception in thread "main" java.lang.Exception: msg hello

        //throw e3;
        //будет  Exception in thread "main" java.lang.Exception: msg
        //Caused by: java.lang.Exception:  hello

        //todo из одного файла поток в другой файл. 1 try с ресурсами. 2 try finally
        method1();

    }

    // try с ресурсами
    private static void method1() throws Exception {
        Exception exception = null;

        try (
                NewScanner newScanner =
                        new NewScanner(new File("C:\\Development\\mephi_java\\src\\lab5\\task7\\inFile"));
                PrintWriter printWriter =
                        new PrintWriter(new File("C:\\Development\\mephi_java\\src\\lab5\\task7\\outFile"))
        ) {
              printWriter.write(newScanner.nextLine() + "\n");
        }catch (Exception e) {
                exception = e;
                e.printStackTrace();
        }
    }

    //try finally
    private static void method2() throws Exception {
        NewScanner scanner = null;
        PrintWriter printWriter = null;
        Exception exception = null;
        try {
            scanner =
                    new NewScanner(new File("C:\\Development\\mephi_java\\src\\lab5\\task7\\inFile"));
            printWriter =
                    new PrintWriter(new File("C:\\Development\\mephi_java\\src\\lab5\\task7\\outFile"));
                printWriter.write(scanner.nextLine() + "\n");
        } catch (Exception e) {
            exception = e;
        } finally {
            try {
                if(scanner != null){
                    scanner.close();
                    System.out.println("Закрыли scanner");
                }
            }catch (Exception e){
                if (exception != null){
                    exception.addSuppressed(e);
                }else {
                    exception = e;
                }
            }
            if (exception != null){
                throw exception;
            }

        }
    }


    private static void getExampleException(Exception e1) throws Exception {
        //throw new IOException("This is ExampleException");
        throw e1;
    }
}

class NewScanner implements AutoCloseable {
    @Override
    public void close() {
        throw new RuntimeException("Я не могу закрыться");
    }

    public NewScanner(File source) throws FileNotFoundException {
        File file = new File(source.getPath());

        //throw new FileNotFoundException();
    }

    String nextLine() throws Exception {
        throw new RuntimeException("from nextLine exception");
        //return "from nextLine";
    }
}

