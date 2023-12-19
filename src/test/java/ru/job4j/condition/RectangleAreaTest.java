package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2ThenSquare2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP10K2Dot5ThenSquare5Dot10() {
        double p = 10;
        double k = 2.5;
        double expected = 5.10;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP7K3Dot4ThenSquare2Dot15() {
        double p = 7;
        double k = 3.4;
        double expected = 2.15;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}