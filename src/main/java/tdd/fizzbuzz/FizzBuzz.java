package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        else if (i % 5 == 0) {
            return "Buzz";
        }
        else if (i % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(i);
    }
}
