package lab5.task5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Реализуйте метод, содержащий код, где применяются классы Scanner и PrintWriter (см. раздел 5.1.5).
 * Но вместо оператора try с ресурсами воспользуйтесь оператором catch.
 * Непременно закройте оба объекта, при условии, что они построены надлежащим образом.
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = null;
        PrintWriter out = null;
        try {

            in = new Scanner(Paths.get("C:\\Development\\mephi_java\\src\\lab5\\task5\\inFile"));
            System.out.println("Scanner открыт.");

            out = new PrintWriter("C:\\Development\\mephi_java\\src\\lab5\\task5\\outFile");
            System.out.println("PrintWriter открыт.");

            while (in.hasNext()){
                out.println(in.next().toLowerCase());
            }
            System.out.println("Write to the outFile successfully");
        } catch (FileNotFoundException e) {
            System.err.println("Внимание ошибка! FileNotFoundException" + e.getMessage());
        } catch (NoSuchFileException e) {
            System.err.println("Внимание ошибка! Неправильное имя файла " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("Внимание ошибка! NullPointerException" + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ошибкааа :(");
        }
        finally {
            try{
            if (in != null){
                in.close();
                System.out.println("Закрыли Scanner.");
            }} catch (Exception e){
                System.err.println("Ошибка при закрытии Scanner");
            }
            try{if (out != null) {
                out.close();
                System.out.println("Закрыли PrintWriter.");
            }}catch (Exception e){
                System.err.println("Ошибка при закрытии PrintWriter");
            }
        }
    }
}

/*
 try (Scanner in = new Scanner(Paths.get("/usr/share/dict/words"));
  PrintWriter out = new PrintWriter("output.txt"))
  {
   while (in.hasNext())
        out.printIn(in.next().toLowerCase());
    }


*/
