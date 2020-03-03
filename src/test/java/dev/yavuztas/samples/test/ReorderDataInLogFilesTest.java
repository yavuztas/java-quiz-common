package dev.yavuztas.samples.test;

import dev.yavuztas.samples.ReorderDataInLogFiles;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReorderDataInLogFilesTest {

    private ReorderDataInLogFiles instance = new ReorderDataInLogFiles();

    @Test
    public void testReorderLogFiles() {

        String[] test = {
                "dig1 8 1 5 1",
                "let4 art can",
                "let1 art can",
                "dig2 3 6",
                "dig3 5 3",
                "let2 own kit dig",
                "let3 art zero"
        };

        String[] expected = {
                "let1 art can",
                "let4 art can",
                "let3 art zero",
                "let2 own kit dig",
                "dig1 8 1 5 1",
                "dig2 3 6",
                "dig3 5 3"
        };

        String[] actual = instance.reorderLogFiles(test);

        assertArrayEquals(expected, actual);

    }

}