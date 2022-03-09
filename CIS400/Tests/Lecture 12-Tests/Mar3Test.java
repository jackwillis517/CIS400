import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Mar3Test {

    Mar3 out = new Mar3();

    @Test
    public void t1() {
        int[] data = new int[]{4, 3, 2, 1};
        int[] result = out.strictlyDecreasing(data);
        assertArrayEquals(result, new int[]{4, 3, 2, 1});
    }
    @Test
    public void t2() {
        int[] data = new int[]{4, 4, 3, 2, 2, 3, 1, 1};
        int[] result = out.strictlyDecreasing(data);
        assertArrayEquals(result, new int[]{4, 3, 1});
    }
    @Test
    public void t3() {
        int[] data = new int[]{5, 1, 2, 1};
        int[] result = out.strictlyDecreasing(data);
        assertArrayEquals(result, new int[]{5, 2, 1});
    }
    @Test
    public void t4() {
        int[] data = new int[]{9, 7, 5, 8, 1};
        int[] result = out.strictlyDecreasing(data);
        assertArrayEquals(result, new int[]{9, 8, 1});
    }
    @Test
    public void t5() {
        int[] data = new int[]{9, 8, 5, 8, 1};
        int[] result = out.strictlyDecreasing(data);
        assertArrayEquals(result, new int[]{9, 8, 1});
    }
}