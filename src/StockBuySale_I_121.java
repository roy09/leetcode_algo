public class StockBuySale_I_121 {
    static public int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int diff = 0;
        for (int count = 0; count < prices.length; count++){
            for(int count1 = count + 1; count1 < prices.length; count1++){
                if (prices[count1] - prices[count] > diff){
                    diff = prices[count1] - prices[count];
                }
            }
        }

        return diff;
    }

    static public int maxProfit2(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < minPrice){
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }


    public static void main(String[] args){
        System.out.println(maxProfit2(new int[] {1, 2}));
    }
}
