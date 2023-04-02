package co.com.sofka.stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    private ParseIntUtil parseIntUtil = new ParseIntUtil();

    int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        return adding(numbers);
    }

    private int adding(String numbers) {
        List<Integer> numbersSplit = parseIntUtil.fromStringToNumber(numbers);
        checkForNegativeNumbers(numbersSplit);
        return numbersSplit.stream().filter(n -> n <= 1000).reduce(0, (a, b) -> a + b);
    }

    private void checkForNegativeNumbers(List<Integer> numbersSplit) {
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        for (Integer integer : numbersSplit) {
            if (integer < 0) negativeNumbers.add(integer);
        }
        if (!negativeNumbers.isEmpty()) throw new NegativesNumbersException("negatives not allowed: " +  ConcatNumberByComma.concatNumbers(negativeNumbers));

    }

    class NegativesNumbersException extends IllegalArgumentException {
        NegativesNumbersException(String message) {
            super(message);
        }
    }
}
