import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Feb10Test {

    Feb10 objUnderTest = new Feb10();

    @Test
    public void t1() {
        List<String> input = Arrays.asList("one", "two", "one");
        List<String> expected = Arrays.asList("two");
        List<String> result = objUnderTest.oddNumOccurences(input);
        assertTrue(result.size() == expected.size()
                && result.containsAll(expected)
                && expected.containsAll(result));
    }

    @Test
    public void t2() {
        List<String> input = Arrays.asList("one", "two", "one", "one");
        List<String> expected = Arrays.asList("one", "two");
        List<String> result = objUnderTest.oddNumOccurences(input);
        assertTrue(result.size() == expected.size()
                && result.containsAll(expected)
                && expected.containsAll(result));
    }

    @Test
    public void t3() {
        List<String> input = Arrays.asList("one", "two", "one", "six", "six", "six");
        List<String> expected = Arrays.asList("two", "six");
        List<String> result = objUnderTest.oddNumOccurences(input);
        assertTrue(result.size() == expected.size()
                && result.containsAll(expected)
                && expected.containsAll(result));
    }
}