package Arrays.day_24;
// Minimum swaps required to keep sub-array equal to or less than equal to k
public class MinimumSwaps {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 3};
        int k = 3;
       int ans = minimumSwaps(arr, k);
        System.out.println(ans);
    }

    /**
     * Steps 1: find the number of elements less than and greater than k
     * steps2: Sliding window check
     * @param arr
     * @param k
     * @return
     */
    private static int minimumSwaps(int[] arr, int k) {
        int good = 0;
        int bad = 0;
        for(int i =0;i<arr.length;i++){

            if(arr[i]<=k){
                good++;
            }

        }
        for(int i =0;i<good;i++){
            if(arr[i]>k){
                bad++;
            }
        }
        int ans = bad;
        int i=0 ,j = good;
        while(j<arr.length){
            if(arr[i]>k){
             bad--;
            }
            if(arr[j]>k){
             bad++;
            }
            ans = Math.min(ans,bad);
            i++;j++;
        }
        return ans;
    }
}
