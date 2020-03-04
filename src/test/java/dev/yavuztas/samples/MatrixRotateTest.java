package dev.yavuztas.samples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixRotateTest {

    MatrixRotate instance = new MatrixRotate();

    @Test
    void whenOddNumberedMatrixGiven_thenRotateShouldWork() {

        int[][] matrix = new int[5][5];
        matrix[0] = new int[]{4, 3, 8, 9, 1};
        matrix[1] = new int[]{9, 5, 0, 3, 2};
        matrix[2] = new int[]{4, 3, 6, 7, 7};
        matrix[3] = new int[]{8, 1, 0, 2, 4};
        matrix[4] = new int[]{7, 2, 5, 9, 1};

        instance.rotate(matrix);

        assertArrayEquals(new int[]{7, 8, 4, 9, 4}, matrix[0]);
        assertArrayEquals(new int[]{2, 1, 3, 5, 3}, matrix[1]);
        assertArrayEquals(new int[]{5, 0, 6, 0, 8}, matrix[2]);
        assertArrayEquals(new int[]{9, 2, 7, 3, 9}, matrix[3]);
        assertArrayEquals(new int[]{1, 4, 7, 2, 1}, matrix[4]);

    }

    @Test
    void whenEvenNumberedMatrixGiven_thenRotateShouldWork() {

        int[][] matrix = new int[4][4];
        matrix[0] = new int[]{4, 3, 8, 9};
        matrix[1] = new int[]{9, 5, 0, 3};
        matrix[2] = new int[]{4, 3, 6, 7};
        matrix[3] = new int[]{8, 1, 0, 2};

        instance.rotate(matrix);

        assertArrayEquals(new int[]{8, 4, 9, 4}, matrix[0]);
        assertArrayEquals(new int[]{1, 3, 5, 3}, matrix[1]);
        assertArrayEquals(new int[]{0, 6, 0, 8}, matrix[2]);
        assertArrayEquals(new int[]{2, 7, 3, 9}, matrix[3]);

    }

    @Test
    void whenEmptyMatrixGiven_thenRotateShouldNotFail() {

        int[][] matrix = new int[4][4];

        instance.rotate(matrix);

        assertArrayEquals(new int[4], matrix[0]);
        assertArrayEquals(new int[4], matrix[1]);
        assertArrayEquals(new int[4], matrix[2]);
        assertArrayEquals(new int[4], matrix[3]);

    }

    @Test
    void whenOneNumberedMatrixGiven_thenRotateShouldNotFail() {

        int[][] matrix = new int[1][1];
        matrix[0] = new int[]{0};

        instance.rotate(matrix);

        assertArrayEquals(new int[]{0}, matrix[0]);

    }


}