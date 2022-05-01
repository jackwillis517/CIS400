import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apr21 {
//    public static void main(String[] args) {
//
//    }

    public int maxEdgesPerPairNodes(int[][] graph) {
        int curr = 0;
        int max = 0;

        int[] arr = new int[graph[0].length];
        for(int i = 0; i < graph.length; i++){
            int sum = 0;
            for(int j = 0; j < graph[0].length; j++){
                sum += graph[i][j];
            }
            arr[i] = sum;
        }
        System.out.println(Arrays.toString(arr));
        boolean hasSubbed = false;
        for(int i = 0; i < graph.length; i++){

            for(int j = 0; j < graph[0].length; j++){
                curr = arr[i] + arr[j];
                if (graph[i][j] == 1 && hasSubbed == false){
                    hasSubbed=true;
                    curr--;
                }
                if(curr > max) max = curr;
            }

        }

        return max;
    }
}
