
import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;


public class RangeSumQuery_303 {

//    static Map<Pair<Integer, Integer>, Integer> map = new HashMap<>();
//
//    public RangeSumQuery_303(int[] nums) {
//        for (int i = 0; i < nums.length; i++){
//            int sum = 0;
//            for (int j = 0; j < nums.length; j++){
//                sum += nums[i] + nums[j];
//                map.put(new Pair(i, j), sum);
//            }
//        }
//    }
//
//    static public int sumRange(int i, int j) {
//        return map.get(new Pair(i, j));
//    }

    int[] sum;
    public RangeSumQuery_303(int[] nums) {
        sum = new int[nums.length];

        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j] - sum[i];
    }

}
