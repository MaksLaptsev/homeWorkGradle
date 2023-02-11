package ru.clevertec;

import java.util.Arrays;

public class ClassUtils {
    public static boolean  isAllPositiveNumbers(String... str){
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
}
