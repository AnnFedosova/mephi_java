package lab4.task7;

//import java.lang.Object;
//import java.awt.Color;

/**
 * Define an enumeration type for the eight combinations of primary colors
 * BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE with methods getRed, getGreen, and getBlue.
 */
public class Main {
    public static void main(String[] args) {

        //Color color = new Color(8);
        Color color = Color.RED;
        System.out.println(color.toString() + Color.getRed); //todo
        //System.out.println(Color.getRed() + " " + Color.getGreen() + " " + Color.getBlue());
        /*for(Color color: Color.values())
            System.out.println(color + " " + color.description + " " + color.description2);
        */
    }
}
