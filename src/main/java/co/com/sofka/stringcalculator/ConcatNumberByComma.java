package co.com.sofka.stringcalculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatNumberByComma {
    static String concatNumbers(List<Integer> negativeNumbers) {
        return Arrays.stream(negativeNumbers.toArray()).map(String::valueOf).collect(Collectors.joining(", "));
    }
}
