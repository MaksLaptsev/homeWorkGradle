package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void testIsPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("35"));
        assertFalse(StringUtils.isPositiveNumber("-1"));
    }
}