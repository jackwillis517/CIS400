import java.util.*;

public class Apr7 {
//    public static void main(String[] args) {
//
//    }

    /*
        if input array (i.e. unsorted) is empty, return Integer.MIN_VALUE
        1. find the two largest numbers in unsorted, i and j
        2. if i == j discard both
        3. otherwise i -= j
        4. repeat steps 1-3 until there is one number left, return this number
     */
    public int reduce(int[] unsorted) {
        if(unsorted.length == 0){
            return Integer.MIN_VALUE;
        }

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.intValue() - o1.intValue();
            }
        };
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(c);
        for(int item : unsorted){
            maxHeap.add(item);
        }

        while(maxHeap.size() > 1){
            int max = maxHeap.poll();
            int secMax = maxHeap.poll();
            int diff = max - secMax;

            if(diff == 0) continue;
            maxHeap.add(diff);
        }

        if(maxHeap.size() == 1) return maxHeap.poll();
        return 0;
    }
}
