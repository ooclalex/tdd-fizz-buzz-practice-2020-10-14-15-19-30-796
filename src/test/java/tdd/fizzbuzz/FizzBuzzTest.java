package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private static final int MODULO_3 = 3;
    private static final int MODULO_5 = 5;
    private static final int MODULO_7 = 7;
    private static final int MODULO_15 = MODULO_3 * MODULO_5;
    private static final int MODULO_21 = MODULO_3 * MODULO_7;
    private static final int MODULO_35 = MODULO_5 * MODULO_7;
    private static final int MODULO_105 = MODULO_3 * MODULO_5 * MODULO_7;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    @Test
    public void should_return_1_when_input_is_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String order = fizzBuzz.countOff(1);

        assertEquals("1", order);
    }

    @Test
    public void should_return_Fizz_when_input_is_multiple_of_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String order = fizzBuzz.countOff(MODULO_3);

        assertEquals(FIZZ, order);
    }

    @Test
    public void should_return_Buzz_when_input_is_multiple_of_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String order = fizzBuzz.countOff(MODULO_5);

        assertEquals(BUZZ, order);
    }

    @Test
    public void should_return_Whizz_when_input_is_multiple_of_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String order = fizzBuzz.countOff(MODULO_7);

        assertEquals(WHIZZ, order);
    }

    @Test
    public void should_return_FizzBuzz_when_input_is_multiple_of_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String order = fizzBuzz.countOff(MODULO_15);

        assertEquals(FIZZ + BUZZ, order);
    }

    @Test
    public void should_return_FizzWhizz_when_input_is_multiple_of_21() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String order = fizzBuzz.countOff(MODULO_21);

        assertEquals(FIZZ + WHIZZ, order);
    }

    @Test
    public void should_return_BuzzWhizz_when_input_is_multiple_of_35() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String order = fizzBuzz.countOff(MODULO_35);

        assertEquals(BUZZ + WHIZZ, order);
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_input_is_multiple_of_105() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String order = fizzBuzz.countOff(MODULO_105);

        assertEquals(FIZZ + BUZZ + WHIZZ, order);
    }
}
