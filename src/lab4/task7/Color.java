package lab4.task7;

public enum Color {
    RED(1),
    BLUE(2),
    WHITE(3);

    private int value;

    Color(/*final*/ int value)
    {
        this.value = value;
    }
//todo
    public String toString()
    {return "" + value;}

    public String getRed()
    {return toString();}

   /* int red = 9;
    int blue = 8;
    int white = 8;
    */

    /*
    Color() {
        red = 0;
        blue = 0;
        white = 0;}
*/

    /*Color(int redParam, int blueParam, int whiteParam) {
        red = redParam;
        blue = blueParam;
        white = whiteParam;
    }*/



  /*  public int getBlue(){
        return blue;
    }

    public int getWhite(){
        return white;
    }
*/
    /*Color(String s) {
        description = s;
    }

    Color(String s, String s2) {
        description = s;
        description2 = s2;
    }*/


}
