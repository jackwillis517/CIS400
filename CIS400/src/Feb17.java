import java.util.*;

public class Feb17 {
//    public static void main(String[] args) {
//
//    }

    public Node reverse(Node list){
        // ON MIDTERM - PRACTICE
        Node dummy = new Node(0);
        while(list != null){
            Node iter = list.next;
            list.next = dummy.next;
            dummy.next = list;
            list = iter;
        }
        return dummy.next;
    }

    public boolean hasCycle(Node list){
        // ON MIDTERM - PRACTICE
        Node slow = list;
        Node fast = list;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public Node delLastNode(Node list) {
        Node dummy = list;

        if(dummy == null){
            return null;
        }

        if(dummy.next == null){
            return null;
        }

        while(dummy.next.next != null){
            dummy = dummy.next;
        }

        if(dummy.next.next == null){
            dummy.next = null;
        }

        return list;
    }
}
