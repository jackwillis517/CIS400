//import java.util.*;
//
//class Node {
//    int value;
//    Node next;
//
//    public Node(int i) {this.value = i;};
//
//    public String tooString() {
//        StringBuilder sb = new StringBuilder();
//        Node curr = this;
//        while(curr != null){
//            sb.append(curr.value);
//            if(curr.next != null){
//                sb.append("->");
//            }
//        }
//        return sb.toString();
//    }
//
//    public Node find(Node list, int lookfor){
//        while(list != null){
//            if(list.value == lookfor){
//                return list;
//            }
//            list = list.next;
//        }
//        return null;
//    }
//
//    public void insert(Node n, Node newNode, int lookFor){
//        while(n != null){
//            if(n.value == lookFor){
//                newNode.next = n.next;
//                n.next = newNode;
//                break;
//            }
//        }
//        n = n.next;
//    }
//
//}
//
//public class Feb10 {
////    public static void main(String[] args) {
////
////    }
//
//    public List<String> oddNumOccurences(List<String> input) {
//        HashMap<String, Integer> map = new HashMap<>();
//        for(int i = 0; i < input.size(); i++){
//            String currWord = input.get(i);
//            if(map.containsKey(currWord)){
//                int temp = map.get(currWord);
//                map.put(currWord, temp + 1);
//            } else{
//                map.put(currWord, 1);
//            }
//        }
//
//        System.out.println(map);
//
//        List<String> res = new ArrayList<>();
//        for(String key: map.keySet()){
//            if(map.get(key) % 2 != 0){
//                res.add(key);
//            }
//        }
//        return res;
//    }
//
//}
