import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheDifference_389 {
    public char findTheDifference(String s, String t) {
        Set<Character> set = new HashSet();

        for (int count = 0; count < s.length(); count++){
            set.add(s.charAt(count));
        }

        for (int count = 0; count < t.length(); count++){
            if (!set.contains(t.charAt(count))){
                return t.charAt(count);
            }
        }

        throw new IllegalArgumentException("No solution for you");
    }

    static public char findTheDifference2(String s, String t) {

        for (int count = 0; count < s.length(); count++){
            if (s.charAt(count) != t.charAt(count)){
                return t.charAt(count);
            }
        }

        return t.charAt(s.length());
    } // fails, array is not sorted

    static public char findTheDifference3(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();
        for (int count = 0; count < s.length(); count++){
            if (map.containsKey(s.charAt(count))){
                map.put(s.charAt(count), map.get(s.charAt(count)) + 1);
            } else {
                map.put(s.charAt(count), 0);
            }
        }

        for (int count = 0; count < t.length(); count++){
            if (!map.containsKey(t.charAt(count))){
                return t.charAt(count);
            } else{
                if (map.get(t.charAt(count)) >= 0){
                    map.put(t.charAt(count), map.get(t.charAt(count)) - 1);
                } else {
                    return  t.charAt(count);
                }
            }
        }

        throw new IllegalArgumentException("WOW");
    } // accepted




    public static void main(String[] args){

        System.out.println(findTheDifference3("aa", "aaa"));
    }


}
