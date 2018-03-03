package lab2.task11;

//СМОТРИ TASK 1

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.LocalDate.of;
import static java.lang.System.out;

/**
 *  Rewrite the Cal class to use static imports for the System and LocalDate classes.
 *  при статическом импорте можно вызывать методы не указывая имена классов
 */
public class Cal {
    public static void printCalendar(int month) {
        //LocalDate date = LocalDate.of(2018, month, 1);
        LocalDate date = of(2018, month, 1);
        int dayOfWeek = date.getDayOfWeek().ordinal();    //вернет номер: пн - 0
        if (dayOfWeek == 6)
            dayOfWeek = 0;
        else dayOfWeek += 1;
        //теперь вс - 0, пн - 1 ... сб - 6.

        out.println(date.getMonth() + ":");
        out.println("  Вс  Пн  Вт  Ср  Чт  Пт  Сб");

        String firstLineOffset = new String(new char[dayOfWeek]).replace("\0", "    "); //\0 = null
        out.print(firstLineOffset);
        while (date.getMonthValue() == month) {
            out.printf("%4d", date.getDayOfMonth()); //%4d - отображение десятичного целого в 4-хсимвольном поле
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY)
                out.println();
            date = date.plusDays(1);
        }
        out.println();

    }
}
