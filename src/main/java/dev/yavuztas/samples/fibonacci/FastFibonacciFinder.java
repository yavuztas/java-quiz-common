package dev.yavuztas.samples.fibonacci;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Time complexity is O(1)
 * Not accurate at n = 200
 */
public class FastFibonacciFinder implements IFibonacciFinder {

    private final MathContext PRECISION = new MathContext(42, RoundingMode.HALF_EVEN);


    private final BigDecimal TWO = new BigDecimal(2);
    private final BigDecimal sqrt5 = new BigDecimal(Math.sqrt(5), PRECISION);
    private final BigDecimal Phi = BigDecimal.ONE.add(sqrt5, PRECISION).divide(TWO, PRECISION);
    private final BigDecimal phi = BigDecimal.ONE.subtract(sqrt5, PRECISION).divide(TWO, PRECISION);

    @Override
    public BigInteger findNthElement(int n) {

        if (n == 0)
            return BigInteger.ZERO;

        if (n == 1)
            return BigInteger.ONE;

        return Phi.pow(n, PRECISION)
                .subtract(phi.pow(n, PRECISION), PRECISION)
                .divide(sqrt5, PRECISION)
                .toBigInteger();
    }

}
