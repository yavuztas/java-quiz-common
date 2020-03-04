package dev.yavuztas.samples.fibonacci;

import java.math.BigInteger;

/**
 * Time complexity is O(c^N) - exponential
 */
public class RecursiveFibonacciFinder implements IFibonacciFinder {

    @Override
    public BigInteger findNthElement(int n) {

        if (n == 0)
            return BigInteger.valueOf(0);

        if (n == 1)
            return BigInteger.valueOf(1);

        return findNthElement(n - 1).add(findNthElement(n - 2));
    }

}
