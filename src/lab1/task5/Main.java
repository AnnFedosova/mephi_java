package lab1.task5;

/**
 * What happens when you cast a double to an int that is larger than the largest possible int value?
 * Try it out.
 * int - целое (размер - 32 бит) от -2147483648 до 2 147 483 647,
 * double - с плавающей запятой (64 бита) от -4.9e-324 до 1.7e+308 (1.7e+308 значит 1.7*10^308)
 */

public class Main {
    public static void main(String[] args){
        double num = 2.0E20;
        System.out.print("Double: " + num + "\nInteger: " + (int) num);

    }
}
/*
Ответ: тип int не может хранить такое большое значение, а значит хранит максимально возможное.
Double: 2.0E20
Integer: 2147483647
 */