package Arrays.day_20;

public class RainWaterTappingProblem {

    public static void main(String[] args) {
       int  arr[] = {3,0,0,2,0,4};
        System.out.println(trappingWater(arr,arr.length));
    }
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) {
        // Your code here
        int right[] = new int[n];
        int left[] = new int[n];
        left[0] = arr[0];
        for(int i = 1;i<n;i++){
            left[i] = Math.max(arr[i],left[i-1]);
        }
        right[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);

        }
        int res = 0;
        for(int i =0;i<n;i++){
            res+=Math.min(left[i],right[i]) - arr[i];
        }
        return res;
    }
}


