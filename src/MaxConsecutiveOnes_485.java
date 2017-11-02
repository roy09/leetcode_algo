public class MaxConsecutiveOnes_485 {
    static public int findMaxConsecutiveOnes(int[] nums) {
        int supermax = 0;
        int max = 0;
        for (int count = 0; count < nums.length; count++){
            if (nums[count] == 1){
                max += 1;
                if (supermax < max){
                    supermax = max;
                }
            } else{
                max = 0;
            }
        }

        return supermax;
    }

    public static void main(String[] args){
        System.out.println(findMaxConsecutiveOnes(new int[] {1,1}));
    }
}
