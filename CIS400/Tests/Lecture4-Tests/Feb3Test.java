import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Feb3Test {
    Feb3 out = new Feb3();

    @Test
    public void t1() {
        assertTrue(out.noRepeatedCharacters(""));
    }
    @Test
    public void t2() {
        assertTrue(out.noRepeatedCharacters("abcdef"));
    }
    @Test
    public void t3() {
        assertFalse(out.noRepeatedCharacters("abcdea"));
    }
}