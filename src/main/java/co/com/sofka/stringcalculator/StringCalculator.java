package co.com.sofka.stringcalculator;

import java.util.List;

public class StringCalculator {

    int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        return adding(numbers);
    }

    private int adding(String numbers) {
        return 0;
    }

    private void checkForNegativeNumbers(List<Integer> numbersSplit) {
    }

    class NegativesNumbersException extends IllegalArgumentException {
        NegativesNumbersException(String message) {
            super(message);
        }
    }
}
