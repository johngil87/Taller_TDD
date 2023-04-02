package co.com.sofka.stringcalculator;

import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParseIntUtilTest {
    private ParseIntUtil numberParser;
    private String input;
    private List<Integer> expected;

    @Before
    public void before() {
        numberParser = new ParseIntUtil();
    }

    public ParseIntUtilTest(String input, List<Integer> expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void parseNumber() {
        assertEquals(expected, numberParser.fromStringToNumber(input));
    }

    @Parameterized.Parameters
    public static Iterable<Object[]>  testIterable() {
        return Arrays.asList(new Object[][] {
                { "1,2,3", List.of(1, 2, 3) },
                { "1\n2\n3", List.of(1, 2, 3) },
                { "//;\n1;2", List.of(1, 2) },
                { "//[***]\n1***2***3", List.of(1, 2, 3) },
        });
    }
}