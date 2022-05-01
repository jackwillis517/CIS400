import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Apr21Test {
    Apr21 out = new Apr21();

    @Test
    public void t1() {
        /*
            {{0, 1, 0, 1}
            {1, 0, 1, 1}
            {0, 1, 0, 0}
            {1, 1, 0, 0}}
         */
        int numNodes = 4;
        int[][] adjMatrix = new int[numNodes][numNodes];
        adjMatrix[0][1] = 1;
        adjMatrix[1][0] = 1;
        adjMatrix[0][3] = 1;
        adjMatrix[3][0] = 1;
        adjMatrix[1][2] = 1;
        adjMatrix[2][1] = 1;
        adjMatrix[1][3] = 1;
        adjMatrix[3][1] = 1;
        assertEquals(4, out.maxEdgesPerPairNodes(adjMatrix));
    }

    @Test
    public void t2() {
        /*
            {{0, 1, 0, 1, 0}
            {1, 0, 1, 1, 0}
            {0, 1, 0, 1, 1}
            {1, 1, 1, 0, 0}
            {0, 0, 1, 0, 0}}
         */
        int numNodes = 5;
        int[][] adjMatrix = new int[numNodes][numNodes];
        adjMatrix[0][1] = 1;
        adjMatrix[1][0] = 1;
        adjMatrix[0][3] = 1;
        adjMatrix[3][0] = 1;
        adjMatrix[1][2] = 1;
        adjMatrix[2][1] = 1;
        adjMatrix[1][3] = 1;
        adjMatrix[3][1] = 1;
        adjMatrix[2][3] = 1;
        adjMatrix[3][2] = 1;
        adjMatrix[2][4] = 1;
        adjMatrix[4][2] = 1;
        assertEquals(5, out.maxEdgesPerPairNodes(adjMatrix));
    }

    @Test
    public void t3() {
        /*
            {{0, 1, 0, 0, 0, 0, 0, 0}
            {1, 0, 1, 0, 0, 0, 0, 0}
            {0, 1, 0, 1, 1, 0, 0, 0}
            {0, 0, 1, 0, 0, 0, 0, 0}
            {0, 0, 1, 0, 0, 0, 0, 0}
            {0, 0, 0, 0, 0, 0, 1, 1}
            {0, 0, 0, 0, 0, 1, 0, 0}
            {0, 0, 0, 0, 0, 1, 0, 0}}
         */
        int numNodes = 8;
        int[][] adjMatrix = new int[numNodes][numNodes];
        adjMatrix[0][1] = 1;
        adjMatrix[1][0] = 1;
        adjMatrix[1][2] = 1;
        adjMatrix[2][1] = 1;
        adjMatrix[2][3] = 1;
        adjMatrix[3][2] = 1;
        adjMatrix[2][4] = 1;
        adjMatrix[4][2] = 1;
        adjMatrix[5][6] = 1;
        adjMatrix[6][5] = 1;
        adjMatrix[5][7] = 1;
        adjMatrix[7][5] = 1;
        assertEquals(5, out.maxEdgesPerPairNodes(adjMatrix));
    }


}