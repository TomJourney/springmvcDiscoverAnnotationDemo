package com.tom.springmvc.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BusiIOUtils.java
 * @Description TODO
 * @createTime 2024年09月22日 20:54:00
 */
public class BusiDateUtils {

    private static final DateTimeFormatter FORMATTER_YEAR_TO_SECOND = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String getNowTextYearToSecond() {
        return LocalDateTime.now().format(FORMATTER_YEAR_TO_SECOND);
    }

    private BusiDateUtils() {
        // do nothing.
    }
}
