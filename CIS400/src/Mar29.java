import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Mar29 {
//    full tree: every node, except leaves, has two children
//    height balanced: height of left subtree = height of right subtree += 1
//    public static void main(String[] args) {
//
//    }

    public int maxDepth(BTreeNode root){
        if (root == null || (root.left == null && root.left == null)) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    static class container{
        BTreeNode node;
        boolean rightVisted;
        public container(BTreeNode n, boolean b) {this.node = n; this.rightVisted = b;}
    }
    public BTreeNode kthNodeInPostOrderTraversal(BTreeNode root, int k) {
        List<BTreeNode> nodeList = new ArrayList<>();
        Deque<container> stack = new ArrayDeque<>();
        stack.push(new container(root, false));
        while(!stack.isEmpty()){
            container curr = stack.pop();
            BTreeNode currNode = curr.node;

            if(currNode == null){
                continue;
            }
            if(curr.rightVisted == true){
                nodeList.add(currNode);
            }
            else {
                stack.push(new container(currNode, true));
                stack.push(new container(currNode.right, false));
                stack.push(new container(currNode.left, false));

            }
        }
        System.out.println(nodeList.size());
        for(int i = 0; i < nodeList.size(); i++){
            if(i+1 == k){
                return nodeList.get(i);
            }
        }
        return null;
    }

}
