package lab4.task7;

public enum Color {
    BLACK,
    RED,
    BLUE,
    GREEN,
    CYAN,
    MAGENTA,
    YELLOW("lemony", "description2_for_lemony"),
    WHITE("snow-white");

    String description;
    String description2;


    Color(String s) {
        description = s;
    }

    Color() {}

    Color(String s, String s2) {
        description = s;
        description2 = s2;
    }

    public static Color getRed(){
        return RED;
    }

    public static Color getGreen(){
        return GREEN;
    }

    public static Color getBlue(){
        return BLUE;
    }




   /* String color;

    Color(String color) {
        this.color = color;
    }

    public Color getGreen(){
        return Color.GREEN;
    }

    public Color getRed(){
        return Color.RED;
    }
    public Color getBlue(){
        return Color.BLUE;
    }*/


}
