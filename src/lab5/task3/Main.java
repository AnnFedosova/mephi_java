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
        System.out.println(sumOfValues("C:\\Development\\mephi_java\\src\\lab5\\task1\\textFile1"));
    }
}
