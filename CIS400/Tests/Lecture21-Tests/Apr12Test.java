import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Apr12Test {
    Apr12 out = new Apr12();
    List<List<Integer>> maze;

    @BeforeEach
    public void setup() {
        maze = new ArrayList<>();
        maze.add(0, List.of(0, 1, 1, 1, 1, 1, 0, 0, 1, 1));
        maze.add(1, List.of(1, 1, 0, 1, 1, 1, 1, 1, 1, 1));
        maze.add(2, List.of(0, 1, 0, 1, 1, 0, 0, 1, 0, 0));
        maze.add(3, List.of(1, 1, 1, 0, 0, 0, 1, 1, 0, 1));
        maze.add(4, List.of(1, 0, 0, 1, 1, 1, 1, 1, 1, 1));
        maze.add(5, List.of(1, 0, 0, 1, 1, 0, 1, 0, 0, 1));
        maze.add(6, List.of(1, 1, 1, 1, 0, 1, 1, 1, 1, 1));
        maze.add(7, List.of(0, 1, 0, 1, 0, 1, 0, 1, 1, 1));
        maze.add(8, List.of(0, 1, 0, 0, 1, 1, 1, 0, 0, 0));
        maze.add(9, List.of(1, 1, 1, 1, 1, 1, 1, 0, 0, 1));
    }

    @Test
    public void t1() {
        assertTrue(out.pathExists(maze, new Coord(5, 0), new Coord(0, 9)));
    }

    @Test
    public void t2() {
        assertFalse(out.pathExists(maze, new Coord(5, 0), new Coord(9, 9)));
    }

    @Test
    public void t3() {
        assertFalse(out.pathExists(maze, new Coord(9, 9), new Coord(4, 3)));
    }

    @Test
    public void t4() {
        assertTrue(out.pathExists(maze, new Coord(0, 9), new Coord(9, 0)));
    }

}