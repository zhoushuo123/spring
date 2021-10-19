package zs.java.basics;

import java.time.LocalDate;

/**
 * 显示当前月的日历,当前日期用*好标记 使用LocalDate类
 * 例子：
 # Mon Tue Wed Thu Fri Sat Sun
 *                          1
 *  2   3   4   5   6   7   8
 *  9  10  11* 12  13  14  15
 * 16  17  18  19  20  21  22
 * 23  24  25  26  27  28  19
 * 30
 *
 */
public class LocalDateTest {
    public static void main(String[] args) {
        //使用静态工厂方法now()，获得当前日期
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        //使用minusDays()方法，获得当前月的第一天
        date = date.minusDays(today-1);
        //获得当前星期几
        int value = date.getDayOfWeek().getValue();
        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
        for (int i=1;i<value;i++){
            System.out.println("    ");
        }
        while (date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth()==today){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            date=date.plusDays(1);
            if (date.getDayOfWeek().getValue()==1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue()==1) {
            System.out.println();
        }
    }
}
