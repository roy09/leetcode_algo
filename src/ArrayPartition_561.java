import java.util.Arrays;

public class ArrayPartition_561 {
    static public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int count = 0; count < nums.length; count += 2){
            sum += nums[count];
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(arrayPairSum(new int[] {1, 4, 3, 9}));
    }
}
