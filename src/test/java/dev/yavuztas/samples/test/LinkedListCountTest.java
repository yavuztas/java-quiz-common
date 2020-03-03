package dev.yavuztas.samples.test;

import dev.yavuztas.samples.LinkedListCount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListCountTest {

    private LinkedListCount instance = new LinkedListCount();

    @Test
    public void whenStandartInputGiven_thenShouldWork() {

        int[] test = new int[]{1, 4, -1, 3, 2};
        int expected = 4;

        int actual = instance.solution(test);
        assertEquals(expected, actual);

    }

    @Test
    public void whenInputWithoutStopGiven_thenShouldWork() {

        int[] test = new int[]{1, 3, 6, 2};
        int expected = 4;

        int actual = instance.solution(test);
        assertEquals(expected, actual);

    }

}