import java.util.HashSet;

public class Feb3 {
//    public static void main(String[] args) {
//
//    }

    public static String convertIntToString(int i){
        StringBuilder result = new StringBuilder();
//        String result = "";
        while(i > 0){
            int digit = i % 10;
//            result = digit + result;
            result.insert(0, digit);
            i = i / 10;
        }

//        return result
        return result.toString();
    }

    public static String urlify(String input, int trueLen){
        char[] copy = new char[input.length()];
        char[] contents = input.toCharArray();
        int nextWrite = 0;
        for(int i = 0; i < trueLen; i++){
            if(contents[i] == ' '){
                copy[nextWrite++] = '%';
                copy[nextWrite++] = '2';
                copy[nextWrite++] = '0';
            } else {
                copy[nextWrite++] = contents[i];
            }
        }

        return String.valueOf(copy);
    }


    public boolean noRepeatedCharacters(String s) {
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                return false;
            } else {
                set.add(s.charAt(i));
            }
        }
        return true;
    }



}
