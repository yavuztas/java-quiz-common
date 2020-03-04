package dev.yavuztas.samples.fibonacci;

import java.math.BigInteger;

/**
 * Time complexity is O(N) - linear
 * Also, the most accurate one
 */
public class OptimizedFibonacciFinder implements IFibonacciFinder {

    @Override
    public BigInteger findNthElement(int n) {

        if (n == 0)
            return BigInteger.ZERO;

        if (n == 1)
            return BigInteger.ONE;

        BigInteger prev = BigInteger.ZERO;
        BigInteger next = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            BigInteger temp = prev.add(next);
            prev = next;
            next = temp;
        }
        return next;
    }

}
