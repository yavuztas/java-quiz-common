package dev.yavuztas.samples;

import dev.yavuztas.samples.utils.Stopwatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution for circular primes problem
 *
 * @author Yavuz Tas
 *
 */
public class CircularPrimes {

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
	 * Checks a prime number is circular. For example: 197, lets circle 971, 719 are
	 * all both primes. So 197 is a circular prime
	 * 
	 * @param prime
	 * @return
	 */
	public boolean isCircular(int prime) {

		if (prime == 2 || prime == 5) {
			return true;
		}

		String value = String.valueOf(prime);

		// numbers end with 0,2,4,5,6,8 is not circular
		if (value.matches(".*[0,2,4,5,6,8].*")) {
			return false;
		}

		List<Integer> circles = new ArrayList<>();
		circles.add(prime);

		int length = value.length();
		char[] chars = value.toCharArray();
		for (int i = 1; i < length; i++) {
			char[] copy = new char[length];
			for (int j = 0; j < length; j++) {
				copy[j] = chars[(j + i) % length];
			}
			circles.add(Integer.valueOf(String.valueOf(copy)));
		}

		Collections.sort(circles);

		for (Integer num : circles) {
			if (!isPrime(num)) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		int n = 1000000;
		System.out.println("Calculating sum of circular prime numbers up to " + n + "...");

		CircularPrimes cp = new CircularPrimes();

		Stopwatch stopwatch = new Stopwatch();
		stopwatch.start();

		int sum = 0;
		for (int i = 2; i < n; i++) {
			if (cp.isCircular(i)) {
				sum += i;
			}
		}

		System.out.println("Total execution time: " + stopwatch.stop() + " seconds");
		System.out.println("Sum: " + sum);

	}

}
