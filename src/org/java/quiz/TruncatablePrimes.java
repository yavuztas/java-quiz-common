package org.java.quiz;

import org.java.quiz.utils.Stopwatch;

/**
 * Solution for Truncatable prime numbers problem
 * 
 * @author Yavuz Tas
 *
 */
public class TruncatablePrimes {

	/**
	 * Basic prime number check
	 * 
	 * @param num
	 * @return
	 */
	public boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		int middle = num / 2;
		for (int i = 2; i <= middle; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks a prime number is truncatable. For example: 3797, left to right 797,
	 * 97, 7 and right to left 397, 37, 3 are all both primes. So 3797 is a
	 * truncatable prime
	 * 
	 * @param prime
	 * @return
	 */
	public boolean isTruncatable(int prime) {
		if (prime < 23) {
			return false;
		}

		String value = String.valueOf(prime);
		int length = value.length();
		for (int i = length - 1; i > 0; i--) {
			// left to right
			String ltr = value.substring(i, length);
			if (!isPrime(Integer.valueOf(ltr))) {
				return false;
			}
			// right to left
			String rtl = value.substring(0, length - i);
			if (!isPrime(Integer.valueOf(rtl))) {
				return false;
			}
		}

		return isPrime(prime);
	}

	public static void main(String[] args) {

		int n = 1000000;
		System.out.println("Calculating sum of truncatable prime numbers up to " + n + "...");

		TruncatablePrimes tp = new TruncatablePrimes();

		Stopwatch stopwatch = new Stopwatch();
		stopwatch.start();

		int sum = 0;
		for (int i = 2; i < n; i++) {
			if (tp.isTruncatable(i)) {
				sum += i;
			}
		}

		System.out.println("Total execution time: " + stopwatch.stop() + " seconds");
		System.out.println("Sum: " + sum);

	}

}
