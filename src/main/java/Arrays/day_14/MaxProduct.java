package Arrays.day_14;

public class MaxProduct {

    public static void main(String[] args) {

      int  Arr[] = {6, -3, -10, 0, 2};
        System.out.println(maxProduct(Arr,Arr.length));
    }

    public static int maxProduct(int arr[] , int n){
        // Initialize maximum products in
        // forward and backward directions
        int max_fwd = Integer.MIN_VALUE,
                max_bkd = Integer.MIN_VALUE;

        //check if zero is present in an array or not
        boolean isZero=false;

        // Initialize current product
        int max_till_now = 1;

        // max_fwd for maximum contiguous
        // product in forward direction
        // max_bkd for maximum contiguous
        // product in backward direction
        // iterating within forward
        // direction in array
        for (int i = 0; i < n; i++)
        {
            // if arr[i]==0, it is breaking
            // condition for contiguous subarray
            max_till_now = max_till_now * arr[i];
            if (max_till_now == 0)
            {
                isZero=true;
                max_till_now = 1;
                continue;
            }

            // update max_fwd
            if (max_fwd < max_till_now)
                max_fwd = max_till_now;
        }

        max_till_now = 1;

        // iterating within backward
        // direction in array
        for (int i = n - 1; i >= 0; i--)
        {
            max_till_now = max_till_now * arr[i];
            if (max_till_now == 0)
            {
                isZero=true;
                max_till_now = 1;
                continue;
            }

            // update max_bkd
            if (max_bkd < max_till_now)
                max_bkd = max_till_now;
        }

        // return max of max_fwd and max_bkd
        int res = Math. max(max_fwd, max_bkd);

        // Product should not be negative.
        // (Product of an empty subarray is
        // considered as 0)
        if(isZero)
            return Math.max(res, 0);

        return res;
    }
}
