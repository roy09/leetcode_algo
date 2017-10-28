import java.util.HashMap;
import java.util.Map;

public class TwoSumII_167 {
    public static void main(String[] args){
        int[] numbers = {0, 0, 3, 4};
        int[] indexes = new TwoSumII_167().twoSum2(numbers, 0);
        System.out.println("index 0 : " + indexes[0]);
        System.out.println("index 1 : " + indexes[1]);
    }

    // simple sol
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int count = 0; count < numbers.length; count++){
            map.put(numbers[count], count);
        }

        for (int count = 0; count < numbers.length; count++){
            int complement = target - numbers[count];

            if (map.containsKey(complement) && map.get(complement) > count){
                return new int[] {count + 1, map.get(complement) + 1};
            }
        }
        throw new IllegalArgumentException("No applicable");
    }

    //
    public int[] twoSum2(int[] numbers, int target) {
        int c1 = 0;
        int c2 = numbers.length - 1;
        while (c1 < c2){
            int addition = numbers[c1] + numbers[c2];
            if (addition == target){
                return new int[] {c1 + 1, c2 + 1};
            } else if (addition > target){
                c2--;
            } else {
                c1++;
            }
        }
        throw new IllegalArgumentException("Not available");
    }
}
