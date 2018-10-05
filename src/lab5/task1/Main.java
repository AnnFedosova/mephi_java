package lab5.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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

    public static void main(String[] args) {
        ArrayList <Double> arrayList = null;
        //попробуем прочииать Double из файла
        try {
            arrayList = readValues("C:\\Development\\mephi_java\\src\\lab5\\task1\\textFile");
            //arrayList = readValues("anotherFile");
        }

        catch (FileNotFoundException e){
            System.out.println("1 Ошибка при открытии файла: " +  e.toString());
        }
        catch (IllegalArgumentException e){
            System.out.println("2 Ошибка при чтении из файла, плохие данные: " +  e.toString());
        }
        catch (Exception e){
            System.out.println("3 Другая ошибка:" + e.toString());
        }
            System.out.print("The End");
    }

    private static ArrayList <Double> readValues(String fileName) throws NullPointerException, FileNotFoundException {
        ArrayList <Double>  arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(new File(fileName)); //FileNotFoundException
        while(scanner.hasNextLine()) {
        //while(scanner.hasNextDouble()) { так не будет ошибки, если в файле буквы. Но мы хотим ее увидеть
            boolean add = arrayList.add(parseDouble(scanner.nextLine()));
            System.out.println("add " + add);
        }

        return arrayList;
    }
}
