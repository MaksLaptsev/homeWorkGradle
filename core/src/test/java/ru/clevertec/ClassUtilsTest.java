package ru.clevertec;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassUtilsTest {
    private String[] strPositiveTrue;
    private String[] strPositiveFalse;
    private String[] strNoNumbers;
    @BeforeEach
    void setUp() {
        strPositiveTrue = new String[]{"25","44"};
        strPositiveFalse = new String[]{"-15","44"};
        strNoNumbers = new String[]{"25","abc"};
    }

    @Test
    void testIsAllPositiveNumbers() {
        assertTrue(ClassUtils.isAllPositiveNumbers(strPositiveTrue));
        assertFalse(ClassUtils.isAllPositiveNumbers(strPositiveFalse));
        assertFalse(ClassUtils.isAllPositiveNumbers(strNoNumbers));
    }
}