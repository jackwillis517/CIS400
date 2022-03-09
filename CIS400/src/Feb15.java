import java.util.HashMap;

public class Feb15 {
//    public static void main(String[] args) {
//
//    }

    public int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int nextWrite = 0;
        int i1 = 0;
        int i2 = 0;

        while(i1 < arr1.length && i2 < arr2.length){
           if(arr1[i1] < arr2[i2]){
               result[nextWrite] = arr1[i1];
               i1++;
           } else {
               result[nextWrite] = arr2[i2];
               i2++;
           }
           nextWrite++;
        }
        while (i1 < arr1.length){
            result[nextWrite++] = arr1[i1++];
        }
        while (i2 < arr2.length){
            result[nextWrite++] = arr2[i2++];
        }

        return result;
    }

    public Node delete(Node list, Node toDelete){
        if(list == null){
            return null;
        }
        if(list.value == toDelete.value){
            return list.next;
        }
        Node dummy = list;
        while(dummy != null && dummy.next != null){
            if(dummy.next.value == toDelete.value){
                dummy.next = dummy.next.next;
                break;
            }
        }

        return list;
    }

    public boolean couldBePalindrome(String input) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < input.length(); i++){
            if(map.containsKey(input.charAt(i))){
                int temp = map.get(input.charAt(i));
                map.put(input.charAt(i), temp + 1);
            } else {
                map.put(input.charAt(i), 1);
            }
        }

        if(input.length() % 2 == 0){
//            if input is even it can't have a odd count
            for(Character key : map.keySet()){
                if(map.get(key) % 2 != 0){
                    return false;
                }
            }

        } else{
            int oddCount = 0;
            for(Character key : map.keySet()){
                if(map.get(key) % 2 != 0){
                    oddCount++;
                }
            }

            if (oddCount > 1){
                return false;
            }
        }

        System.out.println(map);
        return true;
    }
}
