package com.zj.example.joda;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * Created by zhengjiong on 16/5/5.
 */
public class TimeTestUtils {
    public static String FORMAT_DATE = "YYYY-MM-dd";
    public static String FORMAT_DATETIME = "YYYY-MM-dd HH:mm:ss";

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
