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

    @Test
    public void should_return_Fizz_when_input_is_multiple_of_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String order = fizzBuzz.countOff(3);

        assertEquals("Fizz", order);
    }

    @Test
    public void should_return_Buzz_when_input_is_multiple_of_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String order = fizzBuzz.countOff(5);

        assertEquals("Buzz", order);
    }

    @Test
    public void should_return_Whizz_when_input_is_multiple_of_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String order = fizzBuzz.countOff(7);

        assertEquals("Whizz", order);
    }
}
