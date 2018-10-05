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
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        ArrayList<Double> sum = new ArrayList<Double>();
    }

    //вернет код ошибки, изменит arrayList, ссылку на который передали входным параметром
    public static int readValues(String fileName, ArrayList<Double> arrayList) {

        if (fileName == null || fileName.isEmpty())
            return -1; //нет имени файла
        if (arrayList == null || arrayList.isEmpty())
            arrayList = new ArrayList<>();

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
        if (sum == null || sum.isEmpty())
            sum = new ArrayList<Double>();
        int readValuesResult = readValues(filename, sum);
        int sumOfValuesResult;
        for(double d : sum) {

        }
        return 0;
    }
}
