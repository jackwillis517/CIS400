import java.util.HashSet;
import java.util.List;

public class Mar10 {
    public static void main(String[] args) {

    }

    // each node in l1 and l2 is a digit 0-9
    // l1 and l2 are in MSB -> LSB order
    // e.g. l1 = 1 -> 2 -> 3 represents 123
    // l1 and l2 are between 0-7 nodes in length
    public int sum(Node l1, Node l2) {
        return 0;
    }

    // return true if s1 contains all the letters in s2
    // s1 and s2 both consist of lowercase letters, a-z only
    public boolean containsAllLetters(String s1, String s2) {
        HashSet<Character> s2chars = new HashSet<>();

        for(int i = 0; i < s2.length(); i++){
            s2chars.add(s2.charAt(i));
        }

        for(int i = 0; i < s1.length(); i++){
            if(!s2chars.contains(s1.charAt(i))){
                return false;
            }
        }
        return true;
    }

    // build a String from the words in words[]
    // the Strings in words[] need to be rearranged into the right order
    // Each String in words[], say words[i] should go in position[i]
    // Example: words = {"for", "coding", "skills", "interviews"}
    // and positions = {2, 3, 1, 4}
    // the String "for" is at index 0 in words
    // its position is given by positions[0], which is 2
    // so "for" should be the second word in the returned String
    public String reconstitute(String[] words, int[] positions) {
        return "";
    }
}
