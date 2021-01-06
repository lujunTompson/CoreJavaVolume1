package JavaCore.Fourth;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int month = now.getMonthValue();
        int today = now.getDayOfMonth();
        //到本月的第一天
        LocalDate date = now.minusDays(today - 1);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        //星期一就是1，星期二就是2
        int value = dayOfWeek.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        int monthNew = month;
        while (monthNew == month)
        {
            int loopDay = date.getDayOfMonth();
            System.out.printf("%3d", loopDay);
            if (today == loopDay) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            DayOfWeek dayOfWeekNext = date.getDayOfWeek();
            int valueNext = dayOfWeekNext.getValue();
            if (valueNext == 1) {
                System.out.println();
            }
            monthNew = date.getMonthValue();
        }

    }
}
