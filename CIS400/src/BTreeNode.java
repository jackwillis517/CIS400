public class BTreeNode {
    public int value;
    public BTreeNode left;
    public BTreeNode right;
    public BTreeNode(int i) {this.value = i;}

    public static void preorder(BTreeNode root) {
        if (root != null) {
            System.out.println(root.value);
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void inorder(BTreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.value);
            inorder(root.right);
        }
    }
    public static void postorder(BTreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.value);
        }
    }

    public static void main(String[] args) {
        BTreeNode root = new BTreeNode(10);
        root.left = new BTreeNode(5);
        root.right = new BTreeNode(16);
        root.left.left = new BTreeNode(2);
        root.left.right = new BTreeNode(8);
        root.right.left = new BTreeNode(12);
        root.right.right = new BTreeNode(18);

        postorder(root);
    }
}
