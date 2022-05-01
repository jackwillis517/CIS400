import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Apr5Test {
    Apr5 out = new Apr5();
    BTreeNode root1, root2, root3;

    @BeforeAll
    public void setup() {
        root1 = new BTreeNode(100);
        root1.left = new BTreeNode(50);
        root1.left.right = new BTreeNode(75);
        root1.right = new BTreeNode(150);

        root2 = new BTreeNode(100);
        root2.left = new BTreeNode(50);
        root2.left.right = new BTreeNode(101); //??
        root2.right = new BTreeNode(150);

        root3 = new BTreeNode(100);
        root3.left = new BTreeNode(50);
        root3.left.left = new BTreeNode(25);
        root3.left.left.left = new BTreeNode(12);
        root3.left.left.right = new BTreeNode(51); //??
        root3.left.right = new BTreeNode(75);
        root3.right = new BTreeNode(150);
    }

    @Test
    public void t1() {
        assertTrue(out.isBST(root1));
    }
    @Test
    public void t2() {
        assertTrue(out.isBST(root1.left));
    }
    @Test
    public void t3() {
        assertTrue(out.isBST(root1.right));
    }

    @Test
    public void t4() {
        assertFalse(out.isBST(root2));
    }
    @Test
    public void t5() {
        assertTrue(out.isBST(root2.left));
    }
    @Test
    public void t6() {
        assertTrue(out.isBST(root2.right));
    }

    @Test
    public void t7() {
        assertFalse(out.isBST(root3));
    }

    @Test
    public void t8() {
        assertFalse(out.isBST(root3.left));
    }

    @Test
    public void t9() {
        assertTrue(out.isBST(root3.left.left));
    }

}