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

    static public int[] findErrorNums2(int[] nums) {
        int [] data = new int[nums.length + 1];

        for (int num: nums){
            data[num] += 1;
        }

        for (int count = 1; count < data.length; count++){
            if (data[count] == 0){
                data[1] = count;
            } else if (data[count] == 2) {
                data[0] = count;
            }
        }
        return new int[] {data[0], data[1]};
    }

    public static void main(String[] args){
        int[] data = findErrorNums2(new int[] {1, 2, 2, 5, 4});
        for (int s: data){
            System.out.println(s);
        }
    }
}
