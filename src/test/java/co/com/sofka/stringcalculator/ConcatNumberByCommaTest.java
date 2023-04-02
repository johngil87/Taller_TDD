package co.com.sofka.stringcalculator;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static co.com.sofka.stringcalculator.ConcatNumberByComma.concatNumbers;
import static org.hamcrest.CoreMatchers.equalTo;


class ConcatNumberByCommaTest {

    @Test
    @DisplayName("Testing concat list")
    void testConcatList() {
        MatcherAssert.assertThat(concatNumbers(List.of(-1,-2)), equalTo("-1, -2"));
    }
}