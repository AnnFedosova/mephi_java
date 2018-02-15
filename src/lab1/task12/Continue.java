package lab1.task12;

import java.util.Scanner;

/**
 * The Java Development Kit includes a file src.zip with the source code of the Java library.
 * Unzip and, with your favorite text search tool, find usages of the labeled break and continue sequences.
 * Take one and rewrite it without a labeled statement.
 */

public class Continue {

    private static final String NOFOLLOW_LINKS = "test";

    public static void main(String[] args) {
        String array[] = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert array elements: ");
        for (int i = 0; i < 3; i++)
            array[i] = sc.nextLine();
        System.out.println(followLinks(array));
    }

   private static boolean followLinks(String... options) {      //могут быть переданы ноль или более объектов String
        boolean followLinks = true;
        for (String opt: options) {     //opt переходит по всем options
            System.out.println("Here");
            if (opt.equals(NOFOLLOW_LINKS)) {
                followLinks = false;
                continue;
            }
            if(opt.equals(""))
            throw new AssertionError("Should not get here!!");
        }
        return followLinks;
    }
}

//    private static boolean followLinks(LinkOption... options) {
//        boolean followLinks = true;
//        for (LinkOption opt: options) {
//            if (opt == LinkOption.NOFOLLOW_LINKS) {
//                followLinks = false;
//                continue;
//            }
//            if (opt == null)
//                throw new NullPointerException();
//            throw new AssertionError("Should not get here");
//        }
//        return followLinks;
//    }