public class Jan27 {
    public static void main(String[] args) {

    }
    public int[] cumulativeSum(int[] data) {
        int[] res = new int[data.length];
        int sum = data[0];
        for(int i = 0, j = 0; i < data.length; i++){
            res[j++] = sum;
            sum += data[i];
        }

        return res;
    }
}
