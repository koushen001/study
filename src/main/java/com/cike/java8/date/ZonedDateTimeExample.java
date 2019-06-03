package com.cike.java8.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @Description 使用时区的日期时间API
 * @Author kou
 * @Version 1.0
 **/
public class ZonedDateTimeExample {
    public static void main(String args[]) {
        ZonedDateTimeExample zonedDateTimeExample = new ZonedDateTimeExample();
        zonedDateTimeExample.testZonedDateTime();
    }

    public void testZonedDateTime() {

        // 获取当前时间日期
        ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("当期时区: " + currentZone);
    }
}
