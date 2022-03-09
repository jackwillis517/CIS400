import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Feb24Test {

    Feb24 out = new Feb24();

    @Test
    public void t1() {
        assertEquals(0, out.valueOf(null));
    }
    @Test
    public void t2() {
        assertEquals(0, out.valueOf(""));
    }
    @Test
    public void t3() {
        assertEquals(123, out.valueOf("321"));
    }
    @Test
    public void t4() {
        assertEquals(50123, out.valueOf("32105"));
    }
}