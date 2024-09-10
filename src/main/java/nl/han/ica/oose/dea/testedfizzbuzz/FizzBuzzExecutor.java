package nl.han.ica.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzExecutor {

    public String execute(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return "Nothing";
        }
    }

}
