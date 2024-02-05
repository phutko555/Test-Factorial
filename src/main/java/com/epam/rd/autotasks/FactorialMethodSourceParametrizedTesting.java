// FactorialMethodSourceParametrizedTesting.java
package com.epam.rd.autotasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

class FactorialMethodSourceParametrizedTesting {

    Factorial factorial = new Factorial();

    @ParameterizedTest
    @MethodSource("testCases")
    void testFactorial(String in, String expected) {
        assertEquals(expected, factorial.factorial(in));
    }

    private static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{"1", "1"},
                new Object[]{"2", "2"},
                new Object[]{"5", "120"}
                // Add more test cases if needed
        );
    }
}
