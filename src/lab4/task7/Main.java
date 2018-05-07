package lab4.task7;

/**
 * Define an enumeration type for the eight combinations of primary colors
 * BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE with methods getRed, getGreen, and getBlue.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Color.getRed() + " " + Color.getGreen() + " " + Color.getBlue());
        for(Color color: Color.values())
            System.out.println(color + " " + color.description + " " + color.description2);

    }
}
