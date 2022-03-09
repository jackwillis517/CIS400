import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Mar1Test {

    Mar1 out = new Mar1();

    @Test
    public void t1() {
        Node input = Node.build(new int[]{1});
        Node result = out.evenNodesReversed(input);
        assertNull(result);
        assertEquals("1", input.toString());
    }

    @Test
    public void t2() {
        Node input = Node.build(new int[]{1, 2});
        Node result = out.evenNodesReversed(input);
        assertEquals("2", result.toString());
        assertEquals("1", input.toString());
    }

    @Test
    public void t3() {
        Node input = Node.build(new int[]{1, 2, 3, 4, 5});
        Node result = out.evenNodesReversed(input);
        assertEquals("4->2", result.toString());
        assertEquals("1->3->5", input.toString());
    }

    @Test
    public void t4() {
        Node input = Node.build(new int[]{1, 2, 3, 4, 5, 6});
        Node result = out.evenNodesReversed(input);
        assertEquals("6->4->2", result.toString());
        assertEquals("1->3->5", input.toString());
    }

}