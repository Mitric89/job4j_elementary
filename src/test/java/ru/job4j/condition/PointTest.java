package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenX10Y10X22Y20Then2() {
        Point a = new Point(10, 10);
        Point b = new Point(22, 20);
        double result = a.distance(b);
        assertThat(result).isEqualTo(15.62, withPrecision(0.01));
    }

    @Test
    void whenX1Minus1Y10X23Y2Minus3Then5() {
        Point a = new Point(-1, 10);
        Point b = new Point(3, -3);
        double result = a.distance(b);
        assertThat(result).isEqualTo(13.6, withPrecision(0.01));
    }

    @Test
    void whenX1Minus1Y1Minus1X23Y2Minus3Then4Dot47() {
        Point a = new Point(-1, -1);
        Point b = new Point(3, -3);
        double result = a.distance(b);
        assertThat(result).isEqualTo(4.47, withPrecision(0.01));
    }

    @Test
    void whenX1Minus5Y11X28Y20Then13Dot03() {
        Point a = new Point(-5, 1);
        Point b = new Point(8, 0);
        double result = a.distance(b);
        assertThat(result).isEqualTo(13.04, withPrecision(0.01));
    }

    @Test
    void whenX1Minus5Y11Z15X28Y24Z210Then14Dot25() {
        Point a = new Point(-5, 1, 5);
        Point b = new Point(8, 4,  10);
        double result = a.distance3d(b);
        assertThat(result).isEqualTo(14.25, withPrecision(0.01));
    }
}