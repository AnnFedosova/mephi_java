package lab5.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** todo женя
 * В разделе 5.1.6 приведен пример ошибочного внедрения блока операторов catch и finally
 * в блок кода оператора try. Исправьте этот код,
 * во-первых, перехватив исключение в операторе finally,
 * во-вторых, внедрив блок операторов try/finally в блок операторов try / catch,
 * и в-третьих, применив оператор try с ресурсами вместе с оператором catch.    +
 */
public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Development\\mephi_java\\src\\lab5\\task6\\test");
        try (BufferedReader in = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            //Читать из стандартного потока ввода in
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
    }
}







/* В разделе 5.1.6 приведен пример:
public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Development\\mephi_java\\src\\lab5\\task6\\test");
        BufferedReader in = null;
        try {
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8); //Читать из стандартного потока ввода in
        } catch (IOException ex){
            System.err.println("Caught IOException: " + ex.getMessage());
        } finally {
            if (in != null) {
                in.close(); // ВНИМАНИЕ: может быть сгенерировано исключение! } }
            }
        }
    }
}*/
