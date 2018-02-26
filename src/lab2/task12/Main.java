package lab2.task12;

/**
 * Make a file HelloWorld.java that declares a class HelloWorld in a package ch01.sec01.
 * Put it into some directory, but not in a ch01/sec01 subdirectory.
 * From that directory, run javac HelloWorld.java.
 * Do you get a class file? Where? Then run java HelloWorld.
 * What happens? Why?
 * (Hint: Run javap HelloWorld and study the warning message.)
 * Finally, try javac -d . HelloWorld.java. Why is that better?
 */
public class Main {

    /*
    * Сделала HelloWorld.java в package ch01.sec01
    * Перенесла в папку task 12
    * Через командную строку из папки task 12: javac HelloWorld.java
    * Создался HelloWorld.class
    * В командной строке: java HelloWorld.class
    * Error: Could not find or load main class HelloWorld.class
    * А все потому что в файле написано package lab2.task12.ch01.sec01;
    * А он уже вовсе не lab2.task12.ch01.sec01, а lab2.task12
    *
    * По подсказке:
    * 1. C:\Users\Anna\IdeaProjects\mephi_java\src\lab2\task12>javap HelloWorld
    * Warning: Binary file HelloWorld contains lab2.task12.ch01.sec01.HelloWorld
    *
    * 2. javac -d HelloWorld.java
    *
     * */

}
