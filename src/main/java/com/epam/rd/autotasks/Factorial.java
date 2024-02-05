// Factorial.java
package com.epam.rd.autotasks;

import java.math.BigInteger;

public class Factorial {
    public String factorial(String n) {
        if (n == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        int num;
        try {
            num = Integer.parseInt(n);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please provide a non-negative integer.");
        }

        if (num < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result.toString();
    }
}
