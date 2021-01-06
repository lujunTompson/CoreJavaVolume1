package JavaCore.Fourth.Train;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PredefinedClass {
    public static void main(String[] args) {
        System.out.println(new Date());
        String s = new Date().toString();
        System.out.println(s);
        //创建一个对象，将对象的引用存储再birthday变量中
        Date birthday = new Date();
        Date deadline = birthday;
        //对象变量可设置为null
        deadline = null;
        //java中垃圾回收器会处理相关的事宜

        //将时间和日历分开，localdate描述日期
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate specialDay = LocalDate.of(2020, 12, 30);
        int year = specialDay.getYear();
        int month = specialDay.getMonthValue();
        int day = specialDay.getDayOfMonth();
        System.out.println(year + " " + month + " " + day);
        // 新方法,调用这个方法后specialDay并未改变
        LocalDate aFiveHundredDaysLater = specialDay.plusDays(500);
        year = aFiveHundredDaysLater.getYear();
        month = aFiveHundredDaysLater.getMonthValue();
        day = aFiveHundredDaysLater.getDayOfMonth();
        System.out.println(year + " " + month + " " + day);

        //更改器方法
        GregorianCalendar someDay = new GregorianCalendar(1999, 11, 31);
        someDay.add(Calendar.DAY_OF_MONTH, 1000);
        System.out.println(someDay.get(Calendar.YEAR));

    }
}
