class Node {
    public int value;
    public Node next;

    public Node(int i) {this.value = i;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node curr = this;
        while (curr != null) {
            sb.append(curr.value);
            if (curr.next != null) {
                sb.append("->");
            }
            curr = curr.next;
        }
        return sb.toString();
    }

    public static Node build(int[] input) {
        Node dummy = new Node(0);
        Node curr = dummy;
        for (int i: input) {
            curr.next = new Node(i);
            curr = curr.next;
        }
        return dummy.next;
    }
}

//class ArrayBackedStack {
//    private int[] data;
//    private int numElements = 0;
//
//    public ArrayBackedStack(int capacity){
//        this.data = new int[capacity];
//    }
//
//    public void push(int i){
//        if(numElements >= data.length){
//            throw new IllegalStateException("Stack at capacity");
//        }
//        data[numElements++] = i;
//    }
//
//    public void pop(){
//        if(data.length == 0){
//            throw new IllegalStateException("Stack empty");
//        }
//    }
//}

public class Feb22 {
//    public static void main(String[] args) {
//
//    }

    public int length(Node list){
        // ON MIDTERM - PRACTICE
        int count = 0;
        while(list != null){
            count++;
            list = list.next;
        }
        return count;
    }

    public Node removeKthLast(Node list, int k){
        // Missing case where first node needs to be removed
        // ON MIDTERM - PRACTICE
        if (list == null) return null;
        if (k == 0) return list;

        Node sublist = list;
        int len = length(list);

        while(len-k > 1){
            sublist = sublist.next;
            len--;
        }

        sublist.next = sublist.next.next;
        return list;
    }

    public Node removeKthNode2(Node list, int k){
        Node leading = list;
        while(k>0){
            leading = leading.next;
            k--;
        }

        Node lagging = list;
        while(leading.next != null){
            leading = leading.next;
            lagging = lagging.next;
        }

        lagging.next = lagging.next.next;
        return list;
    }

    public Node dedupe(Node list) {
        if(list == null){
            return null;
        }

        if(list.next == null){
            return list;
        }

        Node dummy = list;
        Node ptr = list.next;
        while(dummy != null && dummy.next != null){
            if(dummy.value == ptr.value){
                ptr = ptr.next;
                dummy.next = ptr;
            } else {
                dummy = dummy.next;
                ptr = ptr.next;
            }
        }

        return list;
    }

}
