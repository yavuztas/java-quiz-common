package dev.yavuztas.samples;

/**
 * Custom implementation of an hybrid algoritm of Quick and Merge sort
 *
 * @author Yavuz Tas
 *
 */
public class QuickMergeHybridSort {

    private int[] array;

    public QuickMergeHybridSort(int... integers) {
        this.array = integers;
    }

    public int[] sort(){
        return this.sort(this.array, this.array.length);
    }

    private int[] sort(int[] array, int length) {

        if (length < 2)
            return array;

        int pivotIndex = length /2;
        int pivot = array[pivotIndex];

        int leftIndex = 0, rightIndex = 0;
        int[] left = new int[length], right = new int[length];

        for (int i = 0; i < length; i++) {
            //skip pivot element
            if (i == pivotIndex)
                continue;

            if (array[i] < pivot)
                left[leftIndex++] = array[i];

            if (array[i] >= pivot)
                right[rightIndex++] = array[i];
        }

        int[] leftPart = this.sort(left, leftIndex);
        int[] rightPart = this.sort(right, rightIndex);

        return merge(length, leftPart, leftIndex, pivot, rightPart, rightIndex);
    }

    /**
     * Merge subarrays and pivot element in order of left subarray - pivot - right subarray
     * @param length
     * @param left
     * @param leftCount
     * @param pivot
     * @param right
     * @param rightCount
     * @return
     */
    private int[] merge(int length, int[] left, int leftCount, int pivot, int[] right, int rightCount) {
        int[] merge = new int[length];
        System.arraycopy(left, 0, merge, 0, leftCount);
        merge[leftCount] = pivot;
        System.arraycopy(right, 0, merge, leftCount+1, rightCount);
        return merge;
    }

}
