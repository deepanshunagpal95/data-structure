package Arrays.day_10;

public class MaxProfit {
// Buy and sell stock problem
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfitv2(prices));
    }
 // 7 1 5 3 6 4
    //Step 1: max = 0 min = IntegerMAx
    //2  min 7 max
    public static int maxProfit(int[] prices){

        int maxProfit = 0;
        int minprice = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length ; i++){
            minprice = Math.min(prices[i] , minprice);
            maxProfit = Math.max(maxProfit,prices[i]-minprice );
        }

        return maxProfit;
    }

    public static int maxProfitv2(int[] prices){
        int max = 0;
        int minimum = prices[0];
        for(int i =0;i<prices.length;i++){

            minimum = Math.min(minimum,prices[i]);
            max = Math.max(max,prices[i] - minimum);

        }
        return max;
    }
}
