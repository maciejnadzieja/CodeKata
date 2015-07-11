package pl.macnad;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class FibonacciTest {
    @Test
    public void testFirstTwoValues() {
        assertThat(Fibonacci.get(0)).isEqualTo(0);
        assertThat(Fibonacci.get(1)).isEqualTo(1);
    }

    @Test
    public void testSpecificIndex() {
        assertThat(Fibonacci.get(20)).isEqualTo(6765);
    }

    @Test
    public void shouldReturnSumOfThePreviousTwo() {
        assertThat(Fibonacci.get(2)).isEqualTo(Fibonacci.get(0) + Fibonacci.get(1));
        assertThat(Fibonacci.get(3)).isEqualTo(Fibonacci.get(1) + Fibonacci.get(2));
        assertThat(Fibonacci.get(100)).isEqualTo(Fibonacci.get(98) + Fibonacci.get(99));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldNotSupportNegativeIndex() {
        Fibonacci.get(-1);
    }
}