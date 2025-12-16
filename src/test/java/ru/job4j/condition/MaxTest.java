package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To1Then5() {
        int left = 5;
        int right = 1;
        int expected = 5;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To10Then10() {
        int left = 5;
        int right = 10;
        int expected = 10;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int expected = 5;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To3Then3() {
        int left = 1;
        int middle = 2;
        int right = 3;
        int expected = 3;
        int result = Max.max(left, middle, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax30To150Then150() {
        int left = 30;
        int midLeft = 50;
        int midRight = 90;
        int right = 150;
        int expected = 150;
        int result = Max.max(left, midRight, midLeft, right);
        assertThat(result).isEqualTo(expected);
    }

}