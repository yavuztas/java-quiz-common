package org.java.quiz;

import java.util.Arrays;

/**
 * Solution for function countNumbers that accepts a sorted array of unique
 * integers and, efficiently counts the number of array elements that are less
 * than the parameter lessThan.
 * 
 * @author Yavuz Tas
 *
 */
public class SortedSearch {

	public static int countNumbers(int[] sortedArray, int lessThan) {

		int found = Arrays.binarySearch(sortedArray, lessThan);
		if (found >= 0) {
			return found;
		}

		int insertion = (-1 * found) - 1;
		if (insertion >= sortedArray.length) {
			return sortedArray.length;
		}

		return insertion;
	}

	public static void main(String[] args) {
		System.out.println(SortedSearch.countNumbers(new int[] { 5 }, 6));
	}
}
