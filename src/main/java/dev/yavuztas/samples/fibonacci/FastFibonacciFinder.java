package dev.yavuztas.samples.fibonacci;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Time complexity is O(1)
 */
public class FastFibonacciFinder implements IFibonacciFinder {

    private final double sqrt5 = Math.sqrt(5);
    private final double Phi = (1 + sqrt5) / 2;
    private final double phi = (1 - sqrt5) / 2;

    @Override
    public BigInteger findNthElement(long n) {
        double element = (Math.pow(Phi, n) - Math.pow(phi, n)) / sqrt5;
        return new BigDecimal(element).toBigInteger();
    }

}
