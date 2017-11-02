import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate_217 {
    static public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num: nums){
            if (map.containsKey(num)){
                return true;
            }
            map.put(num, 0);
        }
        return false;
    }

    static public boolean containsDuplicateOptimum(int[] nums) {
        Set<Integer> map = new HashSet<Integer>();

        for (int num: nums){
            if (map.contains(num)){
                return true;
            }
            map.add(num);
        }
        return false;
    }



    public static void main(String[] args){
        System.out.println(containsDuplicate(new int[] {1, 2, 4, 9}));
        System.out.println(containsDuplicateOptimum(new int[] {1, 2, 4, 9}));

    }
}
