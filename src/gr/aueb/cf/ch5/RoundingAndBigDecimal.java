package gr.aueb.cf.ch5;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 */

public class RoundingAndBigDecimal {
    public static void main(String[] args) {
        BigDecimal bigNum = new BigDecimal("10.2345");
        BigDecimal divisor = new BigDecimal("3");
        BigDecimal result;
        BigDecimal result2;

        result = bigNum.divide(divisor, 2, RoundingMode.HALF_UP);
        result2 = bigNum.divide(divisor, 2, RoundingMode.HALF_EVEN);

        System.out.println("Result: " + result);
        System.out.println("Result: " + result2);

    }
}
