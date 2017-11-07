import java.util.HashMap;
import java.util.Map;

public class SetMismatch_635 {
    static public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] data = new int[2];
        for (int count = 0; count < nums.length; count++){
            if (map.containsKey(nums[count])){
                data[0] = nums[count];
            } else {
                map.put(nums[count], count);
            }
        }

        for (int count = 1; count <= nums.length; count++){
            if (!map.containsKey(count)){
                data[1] = count;
            }
        }

        return data;
    }

    public static void main(String[] args){
        int[] data = findErrorNums(new int[] {1, 2, 2, 5, 4});
        for (int s: data){
            System.out.println(s);
        }
    }
}
