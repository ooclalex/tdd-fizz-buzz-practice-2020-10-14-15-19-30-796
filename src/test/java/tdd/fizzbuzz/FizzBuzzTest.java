package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_input_is_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String order = fizzBuzz.countOff(1);

        assertEquals("1", order);
    }
}
