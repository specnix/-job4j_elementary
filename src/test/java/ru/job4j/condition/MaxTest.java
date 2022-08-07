package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax9To2Then9() {
        int left = 9;
        int right = 2;
        int result = Max.comparison(left, right);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To7Then7() {
        int left = 3;
        int right = 7;
        int result = Max.comparison(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.comparison(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}