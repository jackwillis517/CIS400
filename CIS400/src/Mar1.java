import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Mar1 {
//    public static void main(String[] args) {
//
//    }

    public Node evenNodesReversed(Node list) {
        Deque<Node> stack = new ArrayDeque<>();
        while(list != null && list.next != null){
            //tmp is starts as second node
            Node tmp = list.next;

            //Change list.next to point to node after tmp
            list.next = list.next.next;

            //Cut tmp off from the rest of the list
            tmp.next = null;

            //Put tmp node onto stack
            stack.push(tmp);

            //Move to next even node
            list = list.next;
        }

        Node dummy1 = new Node(0);
        Node iter = dummy1;
        while (!stack.isEmpty()){
            Node tmp = stack.pop();
            iter.next = tmp;
            iter = iter.next;
        }

        return dummy1.next;
    }

}
