package lab2.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
//import java.time.DayOfWeek;
/**
 *  Change the calendar printing program so it starts the week on a Sunday.
 *  Also make it print a newline at the end (but only one).
 */
public class Main {
    private static final int month = 2;
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, month, 1);
        int dayOfWeek= date.getDayOfWeek().ordinal();    //вернет номер: пн - 0
        if(dayOfWeek == 6)
            dayOfWeek = 0;
        else dayOfWeek += 1;
        //теперь вс - 0, пн - 1 ... сб - 6.

        System.out.println(date.getMonth() + ":");
        System.out.println("  Вс  Пн  Вт  Ср  Чт  Пт  Сб");

        String firstLineOffset = new String( new char[dayOfWeek]).replace("\0", "    "); //\0 = null
        System.out.print(firstLineOffset);
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth()); //%4d - отображение десятичного целого в 4-хсимвольном поле
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY)
                System.out.println();
            date= date.plusDays(1);
        }
        System.out.println();

    }
}
