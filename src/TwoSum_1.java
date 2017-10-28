import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {


    public static void main(String[] args){
        int[] nums = {2, 4, 10};
        int[] answer = new TwoSum_1().twoSum(nums, 14);

        if (answer != null){
            System.out.println("index 0 : " + answer[0]);
            System.out.println("index 1 : " + answer[1]);
        } else{
            System.out.println("Not Valid");
        }
    }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int count = 0; count < nums.length; count++){
            map.put(nums[count], count);
        }

        for (int count = 0; count < nums.length; count++){
            int complement = target - nums[count];
            if (map.containsKey(complement) && map.get(complement) != count){
                return new int[] {count, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No solution for you");
    }
}
