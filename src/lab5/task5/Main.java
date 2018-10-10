package lab5.task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Реализуйте метод, содержащий код, где применяются классы Scanner и PrintWriter (см. раздел 5.1.5).
 * Но вместо оператора try с ресурсами воспользуйтесь оператором catch.
 * Непременно закройте оба объекта, при условии, что они построены надлежащим образом.
 *
 * Для этого вам придется принять во внимание следующие условия.
 * • Конструктор класса Scanner генерирует исключение.
 * • Конструктор класса PrintWriter генерирует исключение.
 * • Метод hasNext(), next() или println() генерирует исключение.
 * • Метод out.close() генерирует исключение.
 * • Метод in.close() генерирует исключение.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = null;
        PrintWriter printWriter = null;
        boolean fileIsOpen = false;
        try {
            //throw new Exception("ff");
            String str = "";
            in = new Scanner(System.in);
            System.out.println("Scanner открыт;");
            String oneStr = "";
            while (in.hasNext()){
                oneStr = in.next();
                str += oneStr + "\n";
                if(oneStr.equals("exit")) {
                    break;
                }
            }

            printWriter = new PrintWriter("C:\\Development\\mephi_java\\src\\lab5\\task5\\file");
            System.out.println("PrintWriter открыт;");
            fileIsOpen = true;
            Date date = new Date();
            printWriter.println("Сегодня " + date);
            printWriter.println(str);
            System.out.println("Write to the file successfully");
        } catch (FileNotFoundException e) {
            System.out.println("Поймали ошибку " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Ошибкааа :(");
            e.printStackTrace();
        }
        finally {
            if (in != null){
                in.close();
                System.out.println("Закрыли Scanner;");
            }
            if (fileIsOpen) {
                printWriter.close();
                System.out.println("Закрыли PrintWriter;");
            }
        }
    }
}
