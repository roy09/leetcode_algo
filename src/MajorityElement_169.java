import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    static public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int count = 0; count < nums.length; count++){
            if (map.containsKey(nums[count])){
                map.put(nums[count], map.get(nums[count]) + 1);
            } else{
                map.put(nums[count], 1);
            }
            if (map.get(nums[count]) > nums.length / 2){
                return map.get(nums[count]);
            }
        }

        for (Integer key: map.keySet()){
            System.out.println(key);
        }
        throw new IllegalArgumentException("Not applicable");
    }

    public static void main(String[] args){
        System.out.println(majorityElement(new int[] {2, 2, 5, 2}));
//        System.out.println(majorityElement(new int[] {2, 2, 5, 5}));

    }
}
