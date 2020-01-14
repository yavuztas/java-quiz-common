package dev.yavuztas.samples;

public class QuickSort {

    private int[] array;

    public QuickSort(int... integers) {
        this.array = integers;
    }

    public int[] sort(){
        this.sort(this.array, 0, this.array.length-1);
        return this.array;
    }

    private void sort(int[] array, int begin, int end) {
        //exit condition
        if (begin >= end)
            return;

        int pivot = array[end];
        int sortIndex = begin;

        for (int i = begin; i < end; i++) {
            if (array[i] < pivot) {
                int swap = array[sortIndex];
                array[sortIndex] = array[i];
                array[i] = swap;
                sortIndex++;
            }
        }
        //placing pivot to the sort index
        int swap = array[sortIndex];
        array[sortIndex] = pivot;
        array[end] = swap;

        this.sort(array, begin, sortIndex-1);
        this.sort(array, sortIndex+1, end);

    }

}
