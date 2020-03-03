package dev.yavuztas.samples;

/**
 * A solution for linked list count problem
 * Assume an array A contains N elements
 * N is [1 -> 200,000]
 * Elements of A is [-1 -> (N-1)]
 * <p>
 * Find the count of a list that every element is the index of the next element.
 * If the element is -1 then the list ends.
 * <p>
 * Example:
 * A = [1, 4, -1, 3, 2]
 * list[0] = A[0] // 1
 * list[1] = A[1] // 4
 * list[2] = A[4] // 2
 * list[3] = A[2] // -1 => list ends
 */
public class LinkedListCount {

    public int solution(int[] list) {
        int count = 0;
        int currentIndex = 0;
        while (currentIndex > -1 && currentIndex < list.length) {
            currentIndex = list[currentIndex];
            count++;
        }
        return count;
    }

}
