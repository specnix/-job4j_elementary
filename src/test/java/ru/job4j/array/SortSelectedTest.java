package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortFive() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFree() {
        int[] data = new int[] {5, 9, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 7, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFour() {
        int[] data = new int[] {7, 3, 9, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 5, 7, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSix() {
        int[] data = new int[] {6, 3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSeven() {
        int[] data = new int[] {7, 6, 4, 3, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7};
        assertThat(result).containsExactly(expected);
    }
}