import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Mar29Test {
    Mar29 out = new Mar29();
    BTreeNode root;

    @BeforeEach
    public void setup() {
        root = new BTreeNode(100);
        root.left = new BTreeNode(50);
        root.left.left = new BTreeNode(25);
        root.left.right = new BTreeNode(75);
        root.left.left.left = new BTreeNode(12);
        root.left.left.right = new BTreeNode(37);
        root.left.right.right = new BTreeNode(87);
        root.left.right.right.left = new BTreeNode(81);
        root.right = new BTreeNode(150);
        root.right.left = new BTreeNode(125);
        root.right.left.right = new BTreeNode(137);
        root.right.left.right.left = new BTreeNode(132);
        root.right.left.right.left.right = new BTreeNode(135);
        root.right.left.right.right = new BTreeNode(142);
        root.right.right = new BTreeNode(175);
        root.right.right.right = new BTreeNode(200);
    }

    @Test
    public void t1() {
        BTreeNode btn = out.kthNodeInPostOrderTraversal(root, 0);
        assertNull(btn);
    }
    @Test
    public void t2() {
        BTreeNode btn = out.kthNodeInPostOrderTraversal(root, 1);
        assertEquals(12, btn.value);
    }
    @Test
    public void t3() {
        BTreeNode btn = out.kthNodeInPostOrderTraversal(root, 3);
        assertEquals(25, btn.value);
    }
    @Test
    public void t4() {
        BTreeNode btn = out.kthNodeInPostOrderTraversal(root, 4);
        assertEquals(81, btn.value);
    }
    @Test
    public void t5() {
        BTreeNode btn = out.kthNodeInPostOrderTraversal(root, 8);
        assertEquals(135, btn.value);
    }
    @Test
    public void t6() {
        BTreeNode btn = out.kthNodeInPostOrderTraversal(root, 11);
        assertEquals(137, btn.value);
    }
    @Test
    public void t7() {
        BTreeNode btn = out.kthNodeInPostOrderTraversal(root, 13);
        assertEquals(200, btn.value);
    }
    @Test
    public void t8() {
        BTreeNode btn = out.kthNodeInPostOrderTraversal(root, 14);
        assertEquals(175, btn.value);
    }
    @Test
    public void t9() {
        BTreeNode btn = out.kthNodeInPostOrderTraversal(root, 16);
        assertEquals(100, btn.value);
    }
    @Test
    public void t10() {
        BTreeNode btn = out.kthNodeInPostOrderTraversal(root, 18);
        assertNull(btn);
    }

}