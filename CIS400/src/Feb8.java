import java.util.HashMap;
import java.util.Map;

public class Feb8 {
//    public static void main(String[] args) {
//
//    }

    // return true if all values in data < pivot are before
    // values >= pivot
    public boolean onesBeforeZeros(int[] data) {
        boolean s = false;
        for(int i = 0; i < data.length; i++){
            if(s && data[i] == 1) return false;

            if(data[i] == 0){
                s = true;
            }
        }
        return true;
    }

    public String reverseWord1(String input){
        String[] words = input.split(" ");
        for(int i = 0; i < words.length/2; i++){
            String tmp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = tmp;
        }
        StringBuilder result = new StringBuilder();
        for(String s : words){
            result.append(s);
            result.append(" ");
        }
        return result.toString().trim();
    }

    public boolean isAnagram(String t, String s){
        HashMap<Character,Integer> counts = new HashMap<>();
        for(char c : s.toCharArray()){
            if(counts.containsKey(c)){
                counts.put(c, counts.get(c)+1);
            } else {
                counts.put(c, 1);
            }
        }
        for(char c : t.toCharArray()){
            if(!counts.containsKey(c)){
                return false;
            } else {
                counts.put(c, counts.get(c)-1);
            }
        }
        for(Map.Entry<Character, Integer> e: counts.entrySet()){
            if(e.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}
