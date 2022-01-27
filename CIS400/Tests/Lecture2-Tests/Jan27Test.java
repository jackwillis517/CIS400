import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Jan27Test {
    private static Jan27 objUnderTest = new Jan27();

    @Test
    public void t1() {
        int[] input = new int[]{1, 2, 3, 4};
        int[] answer = objUnderTest.cumulativeSum(input);
        // answer[0] = input[0]
        // answer[1] = input[0]+input[1]
        // answer[2] = input[0]+input[1]+input[2]
        // ...
        assertArrayEquals(new int[]{1, 3, 6, 10}, answer);
    }
    @Test
    public void t2() {
        int[] input = new int[]{10, 0, 5, 0, 5, 5};
        int[] answer = objUnderTest.cumulativeSum(input);
        assertArrayEquals(new int[]{10, 10, 15, 15, 20, 25}, answer);
    }
}