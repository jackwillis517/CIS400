import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Feb22Test {
    Feb22 out = new Feb22();

    @Test
    public void t1() {
        Node result = out.dedupe(null);
        assertNull(result);
    }
    @Test
    public void t2() {
        Node input = Node.build(new int[]{1});
        Node result = out.dedupe(input);
        assertEquals("1", result.toString());
    }
    @Test
    public void t3() {
        Node input = Node.build(new int[]{1, 1, 1});
        Node result = out.dedupe(input);
        assertEquals("1", result.toString());
    }
    @Test
    public void t4() {
        Node input = Node.build(new int[]{1, 2, 2, 3});
        Node result = out.dedupe(input);
        assertEquals("1->2->3", result.toString());
    }
    @Test
    public void t5() {
        Node input = Node.build(new int[]{1, 1, 2, 2, 2, 3, 3, 3, 3});
        Node result = out.dedupe(input);
        assertEquals("1->2->3", result.toString());
    }

}