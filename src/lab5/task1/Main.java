package lab5.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/**
 * Напишите метод
 * public ArrayList <Double> readValues (String fileName) throws ...,
 * читающий числа с плавающей точкой из файла.
 * Сгенерируйте подходящие исключения, если файл не удается открыть или же если введены данные,
 * не относящиеся к числам с плавающей точкой.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList <Double> arrayList = null;
        //попробуем прочииать Double из файла
        try {
            arrayList = readValues(null);

            //arrayList = readValues("C:\\Development\\mephi_java\\src\\lab5\\task1\\textFile2");
        }

        catch (FileNotFoundException e){
            throw new FileNotFoundException();
        }
        catch (IllegalArgumentException e){
            throw new IllegalArgumentException();
        }
        catch (InputMismatchException e){
            throw new InputMismatchException();
        }
        catch (Exception e){
            throw new Exception();
        }
            System.out.print("The End");
    }

    public static ArrayList <Double> readValues(String fileName) throws IllegalArgumentException, FileNotFoundException {
        if(fileName == null || fileName.isEmpty()) throw new IllegalArgumentException();
        ArrayList <Double>  arrayList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                boolean add = arrayList.add(scanner.nextDouble());
            }
            return arrayList;
        }
    }
}
