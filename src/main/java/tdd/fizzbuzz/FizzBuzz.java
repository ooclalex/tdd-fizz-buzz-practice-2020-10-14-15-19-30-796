package tdd.fizzbuzz;

public class FizzBuzz {
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
    public String countOff(int i) {
        if (i % MODULO_105 == 0) {
            return FIZZ + BUZZ + WHIZZ;
        }
        if (i % MODULO_35 == 0) {
            return BUZZ + WHIZZ;
        }
        if (i % MODULO_21 == 0) {
            return FIZZ + WHIZZ;
        }
        if (i % MODULO_15 == 0) {
            return FIZZ + BUZZ;
        }
        if (i % MODULO_3 == 0) {
            return FIZZ;
        }
        if (i % MODULO_5 == 0) {
            return BUZZ;
        }
        if (i % MODULO_7 == 0) {
            return WHIZZ;
        }
        return String.valueOf(i);
    }
}
