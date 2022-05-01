public class Apr5 {
//    public static void main(String[] args) {
//
//    }

    public int getMax(BTreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftResult = getMax(root.left);
        int rightResult = getMax(root.right);
        return Math.max(root.value, Math.max(leftResult, rightResult));
    }
    public int getMin(BTreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int leftResult = getMin(root.left);
        int rightResult = getMin(root.right);
        return Math.min(root.value, Math.min(leftResult, rightResult));
    }
    /*
        BST = Binary Search Tree
        for all nodes in BST:
            node.value >= all values in left subtree
            node.value <= all values in right subtree
        recursion OK
     */
    public boolean isBST(BTreeNode root) {
        return helpBST(root);
    }

    public boolean helpBST(BTreeNode current){
        if(current == null && current == null){
            return true;
        }

        if(current.left == null && current.right != null){
            if(current.right.value >= current.value){
                helpBST(current.right);
            } else {
                return false;
            }
        }

        if(current.right == null && current.left != null){
            if(current.left.value <= current.value){
                helpBST(current.left);
            } else {
                return false;
            }
        }

        if(current.right != null && current.left != null){
            if(current.left.value <= current.value && current.right.value >= current.value){
                helpBST(current.left);
                helpBST(current.right);
            } else {
                return false;
            }
        }
        return true;
    }
}
