import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Feb1Test {
    Feb1 objUnderTest = new Feb1();

    @Test
    public void t1() {
        int[] input = new int[] {1, 2, 9};
        int[] result = objUnderTest.increment(input);
        int[] expected = new int[] {1, 3, 0};
        assertArrayEquals(expected, result);
    }

    @Test
    public void t2() {
        int[] input = new int[] {1, 9, 9};
        int[] result = objUnderTest.increment(input);
        int[] expected = new int[] {2, 0, 0};
        assertArrayEquals(expected, result);
    }
    @Test
    public void t3() {
        int[] input = new int[] {9, 9, 9};
        int[] result = objUnderTest.increment(input);
        int[] expected = new int[] {1, 0, 0, 0};
        assertArrayEquals(expected, result);
    }
}