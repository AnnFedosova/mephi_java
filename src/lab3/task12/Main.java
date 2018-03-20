package lab3.task12;

/**
 * Given an array of File objects, sort it so that directories come before files,
 * and within each group, elements are sorted by path name.
 * Use a lambda expression to specify the Comparator.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Given an array of File objects, sort it so that directories come before files, and within each group,
 * elements are sorted by path name. Use a lambda expression to specify the Comparator.
 */
public class Main {
    public static void main(String[] args) {
        List<File> files = listFiles("C:\\Users\\Anna\\IdeaProjects\\mephi_java\\src\\lab3\\task10");
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    private static List<File> listFiles(String path) {
        List<File> files = new ArrayList<>();
        File folder = new File(path);
        Collections.addAll(files, Objects.requireNonNull(folder.listFiles()));

        files.sort((o1, o2) -> {
            if (o1.isDirectory() && o2.isDirectory()) {
                return o1.getName().compareTo(o2.getName());
            }
            if (o1.isDirectory()) {
                return -1;
            }
            if (o2.isDirectory()) {
                return 1;
            }
            return o1.getName().compareTo(o2.getName());
        });

        return files;
    }
}