package lab5.task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;

import static lab5.task1.Main.readValues;

/**
 * Напишите метод  public double sumOfValues(String filename) throws…,
 * вызывающий метод из предыдущего упражнения и возвращающий сумму значений в файле.
 * Организуйте распространение любых исключений вызывающему коду.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(sumOfValues("C:\\Development\\mephi_java\\src\\lab5\\task1\\textFile"));
        }catch (FileNotFoundException e){
            throw new FileNotFoundException("Файл не найден!");
        }
        catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Имя файла!");
        }
        catch (InputMismatchException e){
            throw new InputMismatchException("Плохие данные в файле!");
        }
        catch (Exception e){
            throw new Exception("Неизвестное исключение!");
        }
    }

    public static double sumOfValues(String filename) throws FileNotFoundException {
        ArrayList<Double> doubles = readValues(filename);
        double res = 0;
        for(double d : doubles) {
            res += d;
        }
        return res;
    }
}
