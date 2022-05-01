import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Mar31Test {
    Mar31 out = new Mar31();

    @Test
    public void t1() {
        assertTrue(out.allNodesSameValue(null));
    }
    @Test
    public void t2() {
        BTreeNode root = new BTreeNode(2);
        assertTrue(out.allNodesSameValue(root));
    }
    @Test
    public void t3() {
        BTreeNode root = new BTreeNode(1);
        root.left = new BTreeNode(1);
        root.left.left = new BTreeNode(1);
        root.left.right = new BTreeNode(1);
        root.right = new BTreeNode(1);
        assertTrue(out.allNodesSameValue(root));
    }
    @Test
    public void t4() {
        BTreeNode root = new BTreeNode(2);
        root.left = new BTreeNode(1);
        root.left.left = new BTreeNode(1);
        root.left.right = new BTreeNode(1);
        root.right = new BTreeNode(1);
        assertFalse(out.allNodesSameValue(root));
    }
    @Test
    public void t5() {
        BTreeNode root = new BTreeNode(10);
        root.left = new BTreeNode(10);
        root.left.left = new BTreeNode(10);
        root.left.right = new BTreeNode(2);
        root.right = new BTreeNode(10);
        assertFalse(out.allNodesSameValue(root));
    }
    @Test
    public void t6() {
        BTreeNode root = new BTreeNode(5);
        root.left = new BTreeNode(5);
        root.left.right = new BTreeNode(5);
        root.right = new BTreeNode(5);
        root.right.left = new BTreeNode(3);
        assertFalse(out.allNodesSameValue(root));
    }
    @Test
    public void t7() {
        BTreeNode root = new BTreeNode(7);
        root.right = new BTreeNode(7);
        root.right.left = new BTreeNode(7);
        root.right.left.right = new BTreeNode(7);
        root.right.left.right.left = new BTreeNode(7);
        assertTrue(out.allNodesSameValue(root));
    }
    @Test
    public void t8() {
        BTreeNode root = new BTreeNode(3);
        root.right = new BTreeNode(3);
        root.right.left = new BTreeNode(3);
        root.right.left.right = new BTreeNode(2);
        root.right.left.right.left = new BTreeNode(3);
        assertFalse(out.allNodesSameValue(root));
    }

}