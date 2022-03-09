public class Feb1 {
//    public static void main(String[] args) {
//
//    }

    public int[] increment(int[] input){
        int carry = 0;

        for(int i = input.length - 1; i >= 0; i--){
            if(input[i] == 9){
                carry++;
                input[i] = 0;
            } else {
                    if(input[i] < 9){
                        input[i]++;
                    }
                }
            }
            return input;
        }


//    public String convertIntToString(int i){
//        String res = "";
//        while(i > 0){
//            int digit = i % 10;
//            i = i / 10;
//        }
//    }

//    public void dedupe(int[] sorted) {
//        int nextWrite = 0;
//        for (int i = 0; i < sorted.length; i++){
//            if(sorted[i] != sorted[nextWrite]){
//                sorted[++nextWrite] = sorted[i];
//            }
//        }
//    }
//    Make ints less than pivot on right and greater than or equal to on right
//    public void partition(int[] data, int pivot){
//        int next = 0;
//
//        for(int i = 0; i < data.length; i++){
//            if(data[i] < pivot){
//                int t = data[next];
//                data[next] = data[i];
//                data[i] = t;
//                next++;
//            }
//        }
//
//    }
//    Make three sections: less than pivot | equal to pivot | greater than pivot
//    public void dutchFlag(int[] data, int pivot){
//
//    }
//
////    Make string into char array and reverse it
//    public String reverse(String s){
//
//    }
}
