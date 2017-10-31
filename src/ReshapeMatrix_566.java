public class ReshapeMatrix_566 {
    static public int[][] matrixReshape(int[][] nums, int r, int c) {

        int m = nums.length;
        int n = nums[0].length;

        if (m * n != r * c){
            return nums;
        }

        int[][] returnArray = new int[r][c];

        for (int count = 0; count < r * c; count++){
            returnArray[count / c][count % c] = nums[count / n][count % n];
        }

        return returnArray;
    }

    public static void main(String[] args){
        int[][] nums = {{1,2},{3,4}};
        int r = 1, c = 4;
        int[][] ans = matrixReshape(nums, r, c);

        for (int count = 0; count < ans.length * ans[0].length; count++){
            System.out.println(ans[count / ans[0].length][count % ans[0].length]);
        }


    }
}
