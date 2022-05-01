import java.util.ArrayDeque;
import java.util.Deque;

public class Mar31 {
//    public static void main(String[] args) {
//
//    }

    public boolean allNodesSameValue(BTreeNode root) {
        return helper(root);
    }

    public boolean helper(BTreeNode node){
        if (node == null) return true;
        if (node.left == null && node.right == null) return true;

        if (node.left == null && node.right != null){
            if(node.right.value == node.value){
                helper(node.right);
            } else {
                return false;
            }
        }
        if (node.right == null && node.left != null){
            if(node.left.value == node.value){
                helper(node.left);
            } else {
                return false;
            }
        }
        if(node.left != null && node.right != null){
            if(node.left.value == node.value && node.right.value == node.value){
                helper(node.left);
                helper(node.right);
            } else {
                return false;
            }
        }

        return false;
    }
}
