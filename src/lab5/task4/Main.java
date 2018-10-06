package lab5.task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Повторите предыдущее упражнение, но на этот раз не пользуйтесь исключениями.
 * Вместо этого организуйте возврат кодов ошибок из методов readValues и sumOfValues .
 *
 * Коды ошибок:
 *  0 успешное выполнение
 * -1 ошибка имени файла
 * -2 не удалось добавить данные в массив
 * -3 файл не найден
 * -4 в файле не даблы
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        ArrayList<Double> sum = new ArrayList<Double>();
        sum.add((double) 0);
        int sumOfValuesResult =
                sumOfValues("C:\\Development\\mephi_java\\src\\lab5\\task1\\textFile3", sum);
        //System.out.println("sumOfValuesResult: " + sumOfValuesResult);
        if ((sumOfValuesResult == 0) && (! sum.isEmpty()))
            {System.out.println("Sum: " + sum.get(0));}
        if (sumOfValuesResult != 0){
            switch (sumOfValuesResult) {
                case -1: System.out.println("Ошибка в имени файла");
                    break;
                case -2: System.out.println("Не удалось добавить данные в массив");
                    break;
                case -3: System.out.println("Файл не найден");
                    break;
                case -4: System.out.println("В файле не даблы");
                    break;
            }
        }

    }

    //читает double из файла
    //вернет код ошибки, изменит arrayList, ссылку на который передали входным параметром
    public static int readValues(String fileName, ArrayList<Double> arrayList) {

        if (fileName == null || fileName.isEmpty()) {
            return -1; //нет имени файла
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {

                boolean add = arrayList.add(scanner.nextDouble());
                if (!add) return -2; //не удалось добавить данные в массив
            }
        }
        catch (FileNotFoundException e) {
                return -3; //файл не найден
        }
        catch (InputMismatchException e) {
            return -4; //в файле не даблы
        }
        return 0; //успешное выполнение
    }

    public static int sumOfValues(String filename, ArrayList <Double> sum /*один элемент, сюда пишем сумму*/) {
        if (sum == null)
            sum = new ArrayList<Double>();

        ArrayList<Double> arrayList = new ArrayList<>();
        int readValuesResult = readValues(/*из файла*/filename, /*читаем в список*/arrayList);
        if (readValuesResult != 0){return readValuesResult;}

        for(double d : arrayList) {
            sum.set(0, sum.get(0) + d);
        }
        return 0;
    }
}
