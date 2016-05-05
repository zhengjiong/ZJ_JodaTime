package com.example;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class TestClass {
    public static String FORMAT_DATE = "YYYY-MM-dd";
    public static String FORMAT_DATETIME = "YYYY-MM-dd HH:mm:ss";

    public static void main(String[] args){
        //test1();
        //test2();
        //test3();
        //test4();
        test5();
        //test6();
        //test7();
        //test8();
    }

    /**
     * 8.获取某年的第几月的开始日期
     */
    private static void test8() {
        int year = 2016;
        int month = 5;

        LocalDate localDate = new LocalDate(year, month, 1);
        LocalDate startLocalDate = localDate.withDayOfMonth(1);

        System.out.println("2016年5月 开始日期: " + startLocalDate.toString(FORMAT_DATE));
    }

    /**
     * 7.获取某年的第几月的结束日期
     */
    private static void test7() {
        int year = 2016;
        int month = 5;

        LocalDate localDate = new LocalDate(year, month, 1);
        LocalDate endLocalDate = localDate.dayOfMonth().withMaximumValue();

        System.out.println("2016年5月 结束日期: " + endLocalDate.toString(FORMAT_DATE));
    }

    /**
     * 6.获取当前时间所在的月份
     */
    private static void test6() {
        LocalDate localDate = LocalDate.now();
        System.out.println("当前时间所在的月份: " + localDate.getMonthOfYear());
    }

    /**
     * 5. 获取当前时间所在月的开始日期  和结束时间
     */
    private static void test5() {
        DateTime now = DateTime.now();

        DateTime startDateTime = now.withDayOfMonth(1);
        DateTime endDateTime = now.dayOfMonth().withMaximumValue();

        System.out.println("开始日期: " + startDateTime.toString(FORMAT_DATE));
        System.out.println("结束时间: " + endDateTime.toString(FORMAT_DATE));
    }

    /**
     * 4.获取某年的第几周的开始日期
     */
    private static void test4() {
        int year = 2016;
        int week = 1;
        DateTime localDate = DateTime.now();
        localDate = localDate.withYear(year).withWeekOfWeekyear(week).dayOfWeek().withMinimumValue();
        System.out.println(localDate.toString(FORMAT_DATE));
    }

    /**
     * 3 获取2016年的第1周的结束日期
     */
    private static void test3() {
        int year = 2016;
        int week = 1;

        DateTime localDate = DateTime.now();

        DateTime weekLocalDate = localDate.withYear(year).withWeekOfWeekyear(week).dayOfWeek().withMaximumValue();

        System.out.println(weekLocalDate.toString(FORMAT_DATE));
    }

    /**
     * 2 获取当前时间所在周的结束日期
     */
    private static void test2() {
        LocalDate now = LocalDate.now();

        LocalDate dayEndOfWeek = now.dayOfWeek().withMaximumValue();

        System.out.println(dayEndOfWeek.toString(FORMAT_DATE));
    }

    /**
     * 1 获取当前时间所在周的开始日期
     */
    private static void test1() {
        LocalDate now = LocalDate.now();

        LocalDate dayStartOfWeek = now.dayOfWeek().withMinimumValue();

        System.out.println(dayStartOfWeek.toString(FORMAT_DATE));
    }

}
