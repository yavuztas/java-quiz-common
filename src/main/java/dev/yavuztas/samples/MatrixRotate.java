package dev.yavuztas.samples;

/**
 * A solution for 2D square matrix in-place rotation clockwise
 */
public class MatrixRotate {

    public void rotate(int[][] matrix) {

        int length = matrix.length;

        for (int layer = 0; layer < length / 2; layer++) {
            // max index for both x, y
            int max = length - 1;
            // calculate x borders
            int first = layer;
            int last = max - layer;
            for (int i = first; i < last; i++) {
                int top = matrix[first][i];
                int right = matrix[i][last];
                int bottom = matrix[last][max - i];
                int left = matrix[max - i][first];
                // top -> right
                matrix[i][last] = top;
                // right -> bottom
                matrix[last][max - i] = right;
                // bottom -> left
                matrix[max - i][first] = bottom;
                // left -> top
                matrix[first][i] = left;
            }

        }

    }

}
