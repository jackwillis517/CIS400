import java.util.ArrayDeque;
import java.util.Stack;
import java.util.*;

public class Feb24 {
//    public static void main(String[] args) {
//
//    }
        public int valueOf(String s) {
            if(s == null){
                return 0;
            }

            if(s.length() == 0){
                return 0;
            }

            Deque<Character> stack = new ArrayDeque<>();

            for(int i = 0; i < s.length(); i++) {
                stack.push(s.charAt(i));
            }

            String res = "";
            for(int i = 0; i < s.length(); i++) {
                char newChar = stack.pop();
                res += newChar;
            }

            System.out.println(res);
            return Integer.parseInt(res);
        }

}
