import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lecture2 {
    public void dedupe(int[] sorted) {
        int nextWrite = 0;
        for (int i = 0; i < sorted.length; i++){
            if(sorted[i] != sorted[nextWrite]){
                sorted[++nextWrite] = sorted[i];
            }
        }
    }

//    public static void main(String[] args) {
//        int[] input = new int[]{12, 2, 4, 6};
//        System.out.println(Arrays.toString(input));
//        Lecture2 obj = new Lecture2();
//        obj.reverse(input);
//        System.out.println(Arrays.toString(input));
//    }

//    public void reverse(int[] data){
//        for(int i = data.length - 1, j = 0; j <= i; i--, j++){
//            int t = data[i];
//            data[i] = data[j];
//            data[j] = t;
//        }
//    }
}
