package dev.yavuztas.samples;

import java.util.Locale;

/**
 * Solution for Palindrome function ignores case
 * 
 * @author Yavuz Tas
 *
 */
public class Palindrome {

	public static boolean isPalindrome(String word) {

		int length = word.length();
		int middle = word.length() / 2;

		char[] charArray = word.toLowerCase(Locale.ENGLISH).toCharArray();

		int index = 0;
		while (index <= middle) {
			if (charArray[index++] != charArray[length - index]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(Palindrome.isPalindrome("deleeled"));
	}

}