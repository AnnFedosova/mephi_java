package lab2.task3;

import java.util.ArrayList;
//import java.util.ArrayList;
/**
 *  Can you ever have a mutator method return something other than void?    => YES
 *  Can you ever have an accessor method return void? Give examples when possible.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("List: " + list);
        if(list.add("Cat"))
            System.out.println("Mutator return boolean (now it's true)");
        System.out.println("List: " + list);

        //Can you ever have an accessor method return void? Give examples when possible.
        // можно получать данные не на выход функции как return, а в некоторую переменную
        Accessor accessor = new Accessor();
        accessor.printXY();
        accessor.getXinY();
        accessor.printXY();
    }
}

class Accessor{
    private int x;  //from here
    private int y;  //to here;

    public Accessor(){
        x = 12;
        y = 0;
    }
    public void getXinY(){
        y = x;
    }
    public void printXY(){
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}

