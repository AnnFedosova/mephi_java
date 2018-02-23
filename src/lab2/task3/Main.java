package lab2.task3;

import java.util.ArrayList;

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
        //list.get(0);
    }
    //Can you ever have an accessor method return void? Give examples when possible.
}


