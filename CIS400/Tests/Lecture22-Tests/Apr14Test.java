import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Apr14Test {

    Apr14 out = new Apr14();

    @Test
    public void t1() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 2));
        graph.put(2, Arrays.asList(0, 1));
        assertTrue(out.validPathExists(3, graph, 0, 2));
    }

    @Test
    public void t2() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0));
        graph.put(2, Arrays.asList(0));
        graph.put(3, Arrays.asList(4, 5));
        graph.put(4, Arrays.asList(3, 5));
        graph.put(5, Arrays.asList(3, 4));
        assertFalse(out.validPathExists(6, graph, 0, 5));
    }

    @Test
    public void t3() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0));
        graph.put(2, Arrays.asList(0, 3));      // !!
        graph.put(3, Arrays.asList(2, 4, 5));   // !!
        graph.put(4, Arrays.asList(3, 5));
        graph.put(5, Arrays.asList(3, 4));
        assertTrue(out.validPathExists(6, graph, 0, 5));
    }
}