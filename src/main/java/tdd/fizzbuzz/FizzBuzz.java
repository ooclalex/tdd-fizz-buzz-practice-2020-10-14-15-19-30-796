package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int i) {
        if (i % 105 == 0) {
            return "FizzBuzzWhizz";
        }
        if (i % 35 == 0) {
            return "BuzzWhizz";
        }
        if (i % 21 == 0) {
            return "FizzWhizz";
        }
        if (i % 15 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        if (i % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(i);
    }
}
