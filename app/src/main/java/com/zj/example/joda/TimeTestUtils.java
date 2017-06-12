package com.zj.example.joda;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.Seconds;

/**
 * Created by zhengjiong on 16/5/5.
 */
public class TimeTestUtils {
    public static String FORMAT_DATE = "YYYY-MM-dd";
    public static String FORMAT_DATETIME = "YYYY-MM-dd HH:mm:ss";

    public static void test10(long start, long end) {
        Interval interval = new Interval(start, end);
        Period p = interval.toPeriod();
        System.out.println("时间相差："+p.getDays()+" 天 " + p.getHours()+ " 小时 "+p.getMinutes()+" 分钟"+p.getSeconds()+" 秒");
    }

    public static void test9(long start, long end){
        DateTime dt1 = new DateTime(start);
        DateTime dt2 = new DateTime(end);
        System.out.print("时间相差：");
        System.out.print(Days.daysBetween(dt1, dt2).getDays() + " 天 ");
        System.out.print(Hours.hoursBetween(dt1, dt2).getHours() % 24 + " 小时 ");
        System.out.print(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60 + " 分钟 ");
        System.out.print(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60+ " 秒.");
        System.out.println();
    }

    /**
     * 8.获取某年的第几月的开始日期
     */
    public static String test8() {
        int year = 2016;
        int month = 5;

        LocalDate localDate = new LocalDate(year, month, 1);
        LocalDate startLocalDate = localDate.withDayOfMonth(1);

        return "2016年5月 开始日期: " + startLocalDate.toString(FORMAT_DATE);
    }

    /**
     * 7.获取某年的第几月的结束日期
     */
    public static String test7() {
        int year = 2016;
        int month = 5;

        LocalDate localDate = new LocalDate(year, month, 1);
        LocalDate endLocalDate = localDate.dayOfMonth().withMaximumValue();

        return "2016年5月 结束日期: " + endLocalDate.toString(FORMAT_DATE);
    }

    /**
     * 6.获取当前时间所在的月份
     */
    public static String test6() {
        LocalDate localDate = LocalDate.now();
        return "当前时间所在的月份: " + String.valueOf(localDate.getMonthOfYear());
    }

    /**
     * 5. 获取当前时间所在月的开始日期  和结束时间
     */
    public static String test5() {
        DateTime now = DateTime.now();

        DateTime startDateTime = now.withDayOfMonth(1);
        DateTime endDateTime = now.dayOfMonth().withMaximumValue();

        return "当前时间所在月-开始日期: " + startDateTime.toString(FORMAT_DATE) + " \n " +
                "当前时间所在月-结束时间: " + endDateTime.toString(FORMAT_DATE);
    }

    /**
     * 4.获取某年的第几周的开始日期
     */
    public static String test4() {
        int year = 2016;
        int week = 1;
        DateTime localDate = DateTime.now();
        localDate = localDate.withYear(year).withWeekOfWeekyear(week).dayOfWeek().withMinimumValue();

        return "2016年第1周的开始日期: " + localDate.toString(FORMAT_DATE);
    }

    /**
     * 3 获取2016年的第1周的结束日期
     */
    public static String test3() {
        int year = 2016;
        int week = 1;

        DateTime localDate = DateTime.now();

        DateTime weekLocalDate = localDate.withYear(year).withWeekOfWeekyear(week).dayOfWeek().withMaximumValue();

        return "2016年第1周的结束日期: "+weekLocalDate.toString(FORMAT_DATE);
    }

    /**
     * 2 获取当前时间所在周的结束日期
     */
    public static String test2() {
        LocalDate now = LocalDate.now();

        LocalDate dayEndOfWeek = now.dayOfWeek().withMaximumValue();

        return "当前时间所在周的结束日期: " + dayEndOfWeek.toString(FORMAT_DATE);
    }

    /**
     * 1 获取当前时间所在周的开始日期
     */
    public static String test1() {
        LocalDate now = LocalDate.now();

        LocalDate dayStartOfWeek = now.dayOfWeek().withMinimumValue();

        return "当前时间所在周的开始日期: " + dayStartOfWeek.toString(FORMAT_DATE);
    }
}
