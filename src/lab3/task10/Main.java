package lab3.task10;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Using the listFiles(FileFilter) and isDirectory methods of the java.io.File class,
 * write a method that returns all subdirectories of a given directory.
 * Use a lambda expression instead of a FileFilter object.
 * Repeat with a method expression and an anonymous inner class.
 */
public class Main {
    public static void main(String[] args) {
        /*String path = "C:\\Users\\Anna\\IdeaProjects\\mephi_java\\src\\lab3\\task10";
        File file = new File(path);
        System.out.println(file.listFiles()[0]); //listFiles()  вернет массив строк из папки
        System.out.println(file.isDirectory());
        */
        List<File> files = getSubdirs(new File("C:\\Users\\Anna\\IdeaProjects\\mephi_java\\src\\lab3"));
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
    private static List<File> getSubdirs(File file) {
        List<File> subdirs = Arrays.asList(Objects.requireNonNull(file.listFiles(File::isDirectory)));
        subdirs = new ArrayList<File>(subdirs);

        List<File> deepSubdirs = new ArrayList<File>();
        for(File subdir : subdirs) {
            deepSubdirs.addAll(getSubdirs(subdir));
        }
        subdirs.addAll(deepSubdirs);
        return subdirs;
    }
}