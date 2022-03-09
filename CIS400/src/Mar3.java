import java.util.ArrayDeque;
import java.util.Deque;

public class Mar3 {
//    public static void main(String[] args) {
//
//    }

    public int[] strictlyDecreasing(int[] input) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(input[0]);
        for(int i = 1; i < input.length; i++){
            if(stack.peek() > input[i]){
                stack.push(input[i]);
            } else{
                if(stack.peek() == input[i]){
                    continue;
                }
                if(stack.peek() < input[i]){
                    while(stack.peek() <= input[i] && stack.peek() != null){
                        stack.pop();
                    }
                    stack.push(input[i]);
                }
            }
        }

        int[] arr = new int[stack.size()];
        for(int i = arr.length - 1; i >= 0; i--){
            arr[i] = stack.pop();
        }

        return arr;
    }
}
