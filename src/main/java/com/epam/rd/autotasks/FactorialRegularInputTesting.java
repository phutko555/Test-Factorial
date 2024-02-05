// FactorialRegularInputTesting.java
package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testFactorialZero() {
        assertEquals("1", factorial.factorial("0"));
    }

    @Test
    void testFactorialOne() {
        assertEquals("1", factorial.factorial("1"));
    }

    @Test
    void testFactorialSmallNumber() {
        assertEquals("120", factorial.factorial("5"));
    }

    @Test
    void testFactorialLargeNumber() {
        assertEquals("2432902008176640000", factorial.factorial("20"));
    }

    // Add more regular test cases as needed
}
