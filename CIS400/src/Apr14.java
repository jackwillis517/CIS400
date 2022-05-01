import java.util.*;

public class Apr14 {
//    public static void main(String[] args) {
//
//    }
    public boolean validPathExists(int n, Map<Integer, List<Integer>> graph, int source, int dest) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(source);
        Set<Integer> visited = new HashSet<>();
        while (!queue.isEmpty()) {
            int curr = queue.removeFirst();
            if (curr == dest) return true;
            if (visited.contains(curr)) {
                continue;
            }
            visited.add(curr);

            List<Integer> neighbors = new ArrayList<>();
            int neighborsLength = graph.get(curr).size();
            for(int i = 0; i < neighborsLength; i++){
                neighbors.add(graph.get(curr).get(i));
            }

            for (Integer nextNode : neighbors) {
                if(nextNode == dest){
                    return true;
                }
                queue.add(nextNode);
            }
        }

        return false;
    }

}


