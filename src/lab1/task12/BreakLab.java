package lab1.task12;

import java.util.Scanner;
/**
 * The Java Development Kit includes a file src.zip with the source code of the Java library.
 * Unzip and, with your favorite text search tool, find usages of the labeled break and continue sequences.
 * Take one and rewrite it without a labeled statement.
 */

public class BreakLab {
    private static final int BRACE = 30;
    // label_1:
// while (true) {
//  AclItem();
//  switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
//  case BRACE:
//      ;
//      break;
//  default:
//      jj_la1[3] = jj_gen;
//      break label_1;
//   }
//  }
    public static void main(String[] args) {
        String[] jj_la1 = {"a","b","c","d"};
        String jj_gen = "jj_gen";
        System.out.println("Now jj_la1[3] = " + jj_la1[3]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter param: ");
        int jj_ntk = sc.nextInt();

        boolean flag = true;
        while (flag) {
            AclItem();
            switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {     //логическое_условие ? выражение1 : выражение2    jj_ntk
                case BRACE:
                    break;
                default:
                    jj_la1[3] = jj_gen;
                    System.out.println("Now jj_la1[3] = " + jj_la1[3]);
                    flag = false;
            }
        }
    }
    private static void AclItem() {
        System.out.println("AclItem func");
    }
    private static int jj_ntk() {
        System.out.println("jj_ntk func");
        return BRACE;
    }
}

/*if (age > 14) {
        access = true;
        } else {
        access = false;
        }*/