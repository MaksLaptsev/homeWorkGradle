package ru.clevertec;
import org.apache.commons.lang3.math.NumberUtils;
import java.math.BigDecimal;

public class StringUtils {
    public static boolean isPositiveNumber(String str){
        if (NumberUtils.isParsable(str)){
           return NumberUtils.toScaledBigDecimal(str).compareTo(BigDecimal.valueOf(0)) >= 0;
        }else {
            return false;
        }
    }
}
