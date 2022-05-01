import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Apr7Test {

    Apr7 out = new Apr7();

    @Test
    public void t1() {
        int[] input = new int[]{};
        assertEquals(Integer.MIN_VALUE, out.reduce(input));
    }

    @Test
    public void t2() {
        int random = (int) System.currentTimeMillis();
        int[] input = new int[]{random};
        assertEquals(random, out.reduce(input));
    }

    @Test
    public void t3() {
        int[] input = new int[]{1, 2, 3};
        assertEquals(0, out.reduce(input));
    }

    @Test
    public void t4() {
        int[] input = new int[]{3, 1, 2, 3};
        assertEquals(1, out.reduce(input));
    }

    @Test
    public void t5() {
        int[] input = new int[]{801, 1, 565, 573, 799, 788};
        assertEquals(347, out.reduce(input));
    }
}