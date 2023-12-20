package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenX10Y10X22Y20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenX1Minus1Y10X23Y2Minus3Then5() {
        int x1 = -1;
        int y1 = 0;
        int x2 = 3;
        int y2 = -3;
        double expected = 5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenX1Minus1Y1Minus1X23Y2Minus3Then4Dot47() {
        int x1 = -1;
        int y1 = -1;
        int x2 = 3;
        int y2 = -3;
        double expected = 4.47;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenX1Minus5Y11X28Y20Then13Dot03() {
        int x1 = -5;
        int y1 = 1;
        int x2 = 8;
        int y2 = 0;
        double expected = 13.03;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}