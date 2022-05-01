import java.util.*;

public class Apr12 {
//    public static void main(String[] args) {
//
//    }

    public boolean pathExists(List<List<Integer>> maze, Coord start, Coord dest) {
        Deque<Coord> queue = new ArrayDeque<>();
        queue.add(start);
        Set<Coord> visited = new HashSet<>();
        while (!queue.isEmpty()) {
            Coord currPos = queue.removeFirst();
            if (visited.contains(currPos)) {
                continue;
            }
            visited.add(currPos);

            List<Coord> neighbors = List.of(new Coord(currPos.x, currPos.y+1),
                    new Coord(currPos.x+1, currPos.y),
                    new Coord(currPos.x, currPos.y-1),
                    new Coord(currPos.x-1, currPos.y));

            for (Coord nextPos : neighbors) {
                if(nextPos.x == dest.x && nextPos.y == dest.y){
                    return true;
                }
                if (nextPos.x >= 0 && nextPos.x < maze.size()
                        && nextPos.y >= 0 && nextPos.y < maze.get(0).size()
                        && !visited.contains(nextPos)
                        && maze.get(nextPos.x).get(nextPos.y) == 1) {
                    //add child nodes to queue
                    queue.add(nextPos);
                }
            }
        }

        return false;
    }
}
