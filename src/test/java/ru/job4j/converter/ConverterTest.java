package ru.job4j.converter;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RublesThen2Euros() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert180RublesThen3Dollars() {
        float input = 180;
        float expected = 3;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert50DollarsThen3000Rubles() {
        float input = 50;
        float expected = 3000;
        float output = Converter.dollarToRuble(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert80EurosThen5600Rubles() {
        float input = 80;
        float expected = 5600;
        float output = Converter.euroToRuble(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert420EurosThen490Dollars() {
        float input = 420;
        float expected = 490;
        float output = Converter.euroToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert420DollarsThen360Euros() {
        float input = 420;
        float expected = 360;
        float output = Converter.dollarToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}