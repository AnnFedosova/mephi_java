package lab3.task11;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *  Using the list(FilenameFilter) method of the java.io.File class, write a method that returns all files in a
 *  given directory with a given extension.
 *  Use a lambda expression, not a FilenameFilter. Which variable from the enclosing scope does it capture?
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(listFiles("C:\\Users\\Anna\\IdeaProjects\\mephi_java\\src\\lab3\\task10", ".txt"));
    }

    private static List<File> listFiles(String path, String extension) {
        List<File> files = new ArrayList<>();
        File folder = new File(path);
        Collections.addAll(files, Objects.requireNonNull(folder.listFiles(fileName -> !fileName.isDirectory() && fileName.getName().endsWith(extension))));
        return files;
    }
}