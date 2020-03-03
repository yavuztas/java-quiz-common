package dev.yavuztas.samples.fibonacci;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OptimizedFibonacciFinder implements IFibonacciFinder {

    @Override
    public BigInteger findNthElement(long n) {

        if (n == 0)
            return BigInteger.ZERO;

        if (n == 1)
            return BigInteger.ONE;

        double prev = 0;
        double next = 1;
        for (int i = 2; i <= n; i++) {
            double temp = prev + next;
            prev = next;
            next = temp;
        }
        return new BigDecimal(next).toBigInteger();
    }

}
