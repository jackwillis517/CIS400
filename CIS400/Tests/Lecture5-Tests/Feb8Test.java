import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Feb8Test {

    Feb8 objUnderTest = new Feb8();

    @Test
    public void t1()  {
        int[] input = new int[]{0, 0};
        assertTrue(objUnderTest.onesBeforeZeros(input));
    }

    @Test
    public void t2()  {
        int[] input = new int[]{1, 1, 1, 1, 1, 1};
        assertTrue(objUnderTest.onesBeforeZeros(input));
    }

    @Test
    public void t3() {
        int[] input = new int[]{1, 1, 1, 0};
        assertTrue(objUnderTest.onesBeforeZeros(input));
    }

    @Test
    public void t4() {
        int[] input = new int[]{1, 1, 1, 1, 0, 1};
        assertFalse(objUnderTest.onesBeforeZeros(input));
    }

    @Test
    public void t5() {
        int[] input = new int[]{0, 1, 1};
        assertFalse(objUnderTest.onesBeforeZeros(input));
    }

}