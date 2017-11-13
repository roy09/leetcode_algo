import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_242 {

    // for unicode sol
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap();

        for (int count = 0; count < s.length(); count++){
            if (map.containsKey(s.charAt(count))){
                map.put(s.charAt(count), map.get(s.charAt(count)) + 1);
            } else {
                map.put(s.charAt(count), 1);
            }
        }

        for (int count = 0; count < t.length(); count++){
            if (map.containsKey(t.charAt(count))){
                map.put(t.charAt(count), map.get(t.charAt(count)) - 1);

                if (map.get(t.charAt(count)) < 0){
                    System.out.println(t.charAt(count) + " " + count);
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    //

    public boolean isAnagram2(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        int[] charMap = new int[26];

        for (int count = 0; count < s.length(); count++){
            charMap[s.charAt(count) - 'a'] += 1;
            charMap[t.charAt(count) - 'a'] -= 1;
        }

        for (int i: charMap){
            if (i != 0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args){
        System.out.println(new ValidAnagram_242().isAnagram2("anagram", "nagaram"));
        System.out.println(new ValidAnagram_242().isAnagram2("cat", "tar"));
        System.out.println(new ValidAnagram_242().isAnagram2("ab", "a"));


    }
}
