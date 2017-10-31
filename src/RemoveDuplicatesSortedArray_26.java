public class RemoveDuplicatesSortedArray {
    static public int removeDuplicates(int[] nums) {
        int temp = 0;
        int last = 0;
        for(int count = 0; count < nums.length; count++){
            if (count == 0){
                last = nums[count];
                temp++;
            } else {
                if (nums[count] == last){

                } else {
                    last = nums[count];
                    nums[temp] = last;
                    temp++;
                }
            }
        }
        return temp;
    }

    static public int removeDuplicateOptimum(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int temp = 1;
        int last = nums[0];
        for(int count = 1; count < nums.length; count++){
            if (nums[count] != last){
                last = nums[count];
                nums[temp] = last;
                temp++;
            }

        }

        return temp;
    }


    public static void main(String[] args){
//        System.out.println(removeDuplicates(new int[] {1, 1, 4, 4, 10}));
        System.out.println(removeDuplicateOptimum(new int[] {1, 2}));

    }
}
