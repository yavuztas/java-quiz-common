package dev.yavuztas.samples;

public class MergeSort {

    private int[] array;

    public MergeSort(int... integers) {
        this.array = integers;
    }

    public int[] sort() {
        return this.sort(this.array);
    }

    private int[] sort(int[] array) {

        if (array.length < 2)
            return array;

        int maxLength = array.length;
        int partitionIndex = maxLength / 2;

        int leftIndex = 0, rightIndex = 0;
        int[] left = new int[partitionIndex];
        int[] right = new int[maxLength - partitionIndex];

        for (int i = 0; i < partitionIndex; i++) {
            left[leftIndex++] = array[i];
        }
        for (int i = partitionIndex; i < maxLength; i++) {
            right[rightIndex++] = array[i];
        }

        int[] leftPart = this.sort(left);
        int[] rightPart = this.sort(right);

        return merge(maxLength, leftPart, rightPart);
    }

    private int[] merge(int length, int[] left, int[] right) {
        int[] merge = new int[length];
        //compare and merge
        int mergeIndex = 0, leftIndex = 0, rightIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                merge[mergeIndex++] = left[leftIndex++];
            } else {
                merge[mergeIndex++] = right[rightIndex++];
            }
        }
        //add remaining left
        while (leftIndex < left.length) {
            merge[mergeIndex++] = left[leftIndex++];
        }
        //add remaining right
        while (rightIndex < right.length) {
            merge[mergeIndex++] = right[rightIndex++];
        }

        return merge;
    }

}
