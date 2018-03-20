package lab3.task3;

import javax.imageio.stream.ImageOutputStream;
import java.util.*;

/**
 * What are all the supertypes of String? Of Scanner? Of ImageOutputStream? Note that each type is its own supertype.
 * A class or interface without declared supertype has supertype Object.
 */
public class Main {
    public static void main(String[] args) {
        Set<Class> stringTypes = getGeneralizations(String.class);
        System.out.println("------- " + String.class.getName() + " -------");
        printSet(stringTypes);
        Set<Class> scannerTypes = getGeneralizations(Scanner.class);
        System.out.println("\n------- " + Scanner.class.getName() + " -------");
        printSet(scannerTypes);
        Set<Class> imageOutputStreamTypes = getGeneralizations(ImageOutputStream.class);
        System.out.println("\n------- " + ImageOutputStream.class.getName() + " -------");
        printSet(imageOutputStreamTypes);
    }

    private static Class[] getSuperInterfaces(Class[] childInterfaces) {

        List<Class> allInterfaces = new ArrayList<Class>();

        for (Class childInterface : childInterfaces) {
            allInterfaces.add(childInterface);
            allInterfaces.addAll(
                    Arrays.asList(
                            getSuperInterfaces(childInterface.getInterfaces())));
        }

        return (Class[]) allInterfaces.toArray(new Class[allInterfaces.size()]);
    }

    private static Set<Class> getGeneralizations(Class classObject) {
        Set<Class> generalizations = new HashSet<>();

        generalizations.add(classObject);

        Class superClass = classObject.getSuperclass();
        if (superClass != null) {
            generalizations.addAll(getGeneralizations(superClass));
        }

        Class[] superInterfaces = classObject.getInterfaces();
        for (Class superInterface : superInterfaces) {
            generalizations.addAll(getGeneralizations(superInterface));
        }

        return generalizations;
    }

    private static void printSet(Set<Class> set) {
        for (Object obj: set) {
            System.out.println(obj);
        }
    }
}