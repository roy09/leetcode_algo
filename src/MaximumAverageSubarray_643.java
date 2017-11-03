public class MaximumAverageSubarray_643 {
    static public double findMaxAverage(int[] nums, int k) {
        double sum = Double.NEGATIVE_INFINITY;
        double temp = 0;
        for (int count = 0; count <= nums.length - k; count++){
            temp = 0;
            for (int i = count; i < count + k; i++){
                temp += nums[i];
            }

            if (sum < temp){
                sum = temp;
            }
        }
        return sum / k;
    } // TLE

    static public double findMaxAverage2(int[] nums, int k) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];

        for (int count = 1; count < nums.length; count++){
            sum[count] = sum[count - 1] + nums[count];
        }

        double returnVal = sum[k - 1];
        for (int count = k; count < nums.length; count++){
            returnVal = Math.max(returnVal, sum[count] - sum[count - k]);
        }

        return returnVal/k;
    }



    public static void main(String[] args){
//        System.out.println(findMaxAverage2(new int[] {5,12,-5,-6,50,3}, 4));
        System.out.println(findMaxAverage2(new int[] {5}, 1));
    }
}
