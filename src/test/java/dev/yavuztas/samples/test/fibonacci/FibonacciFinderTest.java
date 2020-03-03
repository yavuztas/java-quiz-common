package dev.yavuztas.samples.test.fibonacci;

import dev.yavuztas.samples.fibonacci.FastFibonacciFinder;
import dev.yavuztas.samples.fibonacci.IFibonacciFinder;
import dev.yavuztas.samples.fibonacci.OptimizedFibonacciFinder;
import dev.yavuztas.samples.fibonacci.RecursiveFibonacciFinder;
import dev.yavuztas.samples.utils.Stopwatch;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciFinderTest {

    private IFibonacciFinder recursiveFinder = new RecursiveFibonacciFinder();
    private IFibonacciFinder optimizedFinder = new OptimizedFibonacciFinder();
    private IFibonacciFinder fastFinder = new FastFibonacciFinder();

    @Test
    void findNthElementWithRecursive() {

        BigInteger actual = recursiveFinder.findNthElement(0);
        assertEquals(BigInteger.ZERO, actual);

        actual = recursiveFinder.findNthElement(1);
        assertEquals(BigInteger.ONE, actual);

        actual = recursiveFinder.findNthElement(2);
        assertEquals(BigInteger.ONE, actual);

        actual = recursiveFinder.findNthElement(3);
        assertEquals(BigInteger.valueOf(2), actual);

        actual = recursiveFinder.findNthElement(4);
        assertEquals(BigInteger.valueOf(3), actual);

        actual = recursiveFinder.findNthElement(5);
        assertEquals(BigInteger.valueOf(5), actual);

        actual = recursiveFinder.findNthElement(13);
        assertEquals(BigInteger.valueOf(233), actual);

    }

    @Test
    void findNthElementWithOptimized() {

        BigInteger actual = optimizedFinder.findNthElement(0);
        assertEquals(BigInteger.ZERO, actual);

        actual = optimizedFinder.findNthElement(1);
        assertEquals(BigInteger.ONE, actual);

        actual = optimizedFinder.findNthElement(2);
        assertEquals(BigInteger.ONE, actual);

        actual = optimizedFinder.findNthElement(3);
        assertEquals(BigInteger.valueOf(2), actual);

        actual = optimizedFinder.findNthElement(4);
        assertEquals(BigInteger.valueOf(3), actual);

        actual = optimizedFinder.findNthElement(5);
        assertEquals(BigInteger.valueOf(5), actual);

        actual = optimizedFinder.findNthElement(13);
        assertEquals(BigInteger.valueOf(233), actual);

    }

    @Test
    void findNthElementWithFast() {

        BigInteger actual = fastFinder.findNthElement(0);
        assertEquals(BigInteger.ZERO, actual);

        actual = fastFinder.findNthElement(1);
        assertEquals(BigInteger.ONE, actual);

        actual = fastFinder.findNthElement(2);
        assertEquals(BigInteger.ONE, actual);

        actual = fastFinder.findNthElement(3);
        assertEquals(BigInteger.valueOf(2), actual);

        actual = fastFinder.findNthElement(4);
        assertEquals(BigInteger.valueOf(3), actual);

        actual = fastFinder.findNthElement(5);
        assertEquals(BigInteger.valueOf(5), actual);

        actual = fastFinder.findNthElement(13);
        assertEquals(BigInteger.valueOf(233), actual);

    }

    @Test
    void performanceOfRecursive() {

        Stopwatch stopwatch = new Stopwatch();

        stopwatch.start();
        BigInteger actual = recursiveFinder.findNthElement(40);
        double seconds = stopwatch.stop();

        System.out.println(actual);
        System.out.println(seconds + " seconds...");

    }

    @Test
    void performanceOfOptimized() {

        Stopwatch stopwatch = new Stopwatch();

        stopwatch.start();
        BigInteger actual = optimizedFinder.findNthElement(300);
        double seconds = stopwatch.stop();

        System.out.println(actual);
        System.out.println(seconds + " seconds...");

    }

    @Test
    void performanceOfFast() {

        Stopwatch stopwatch = new Stopwatch();

        stopwatch.start();
        BigInteger actual = fastFinder.findNthElement(300);
        double seconds = stopwatch.stop();

        System.out.println(actual);
        System.out.println(seconds + " seconds...");

    }

}