package lab5.task3;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;

import static lab5.task2.Main.sumOfValues;

/**
 * Напишите программу, вызывающую метод из предыдущего упражнения и выводящую полученный результат.
 * Организуйте перехват исключений и
 * предоставьте ответную реакцию на действия пользователя в виде сообщений о любых ошибочных условиях.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(sumOfValues("C:\\Development\\mephi_java\\src\\lab5\\task1\\textFile1"));
        }
        catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Имя файла!");
        }
        catch (InputMismatchException e){
            throw new InputMismatchException("Плохие данные в файле!");
        }
        catch (FileNotFoundException e){
            throw new FileNotFoundException("Файл не найден!");
        }
        catch (Exception e){
            throw new Exception("Неизвестное исключение!" + e.getMessage());
        }
    }
}
