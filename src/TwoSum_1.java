public class TwoSum_1 {


    public static void main(String[] args){
        int[] nums = {2, 4, 10};
        int[] answer = new TwoSum_1().twoSum(nums, 15);

        if (answer != null){
            System.out.println("index 0 : " + answer[0]);
            System.out.println("index 1 : " + answer[1]);
        } else{
            System.out.println("Not Valid");
        }
    }

    private int[] twoSum(int[] nums, int target) {
        for(int c1 = 0; c1 < nums.length; c1++){
            for(int c2= c1 + 1; c2 < nums.length; c2++){
                if(nums[c1] + nums[c2] == target){
                    int[] data = {c1, c2};
                    return data;
                }
            }
        }
        return null;
    }
}
