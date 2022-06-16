package Arrays.day_10;

public class MaxProfit {
// Buy and sell stock problem
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfitv2(prices));
        System.out.println("Appraoch two");
        System.out.println(maxProfitPepCodingSol(prices));
    }
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
    //https://www.youtube.com/watch?v=4YjEHmw1MX0
    public static int maxProfitPepCodingSol(int[] prices){
        int least_price_So_far = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profit_so_far = 0;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<least_price_So_far){
                least_price_So_far= prices[i];
            }
            profit_so_far = prices[i] - least_price_So_far;
            if(profit_so_far>overallProfit){
                overallProfit = profit_so_far;
            }
        }
            return overallProfit;
    }
}
