import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Feb17Test {

    Feb17 out = new Feb17();

    @Test
    public void t1() {
        assertNull(out.delLastNode(null));
    }
    @Test
    public void t2() {
        Node input = new Node(0);
        assertNull(out.delLastNode(input));
    }
    @Test
    public void t3() {
        Node input = Node.build(new int[]{1, 2});
        Node result = out.delLastNode(input);
        assertEquals("1", result.toString());
    }
    @Test
    public void t4() {
        Node input = Node.build(new int[]{1, 2, 3, 4, 5, 6, 7, 78, 9});
        Node result = out.delLastNode(input);
        assertEquals("1->2->3->4->5->6->7->78", result.toString());
    }

}