package Arrays.day_5;

import util.ArrayUtil;

import java.util.Arrays;

public class MiniMiseTheMAXDifference {
    public static void main(String[] args) {
        int[] arr = ArrayUtil.getArr();
        System.out.println(minimise(arr,1));
        int[] arr2 = { 7, 4, 8, 8, 8, 9 };
        System.out.println(minimise(arr,6));
    }


    public static int minimise(int[] arr , int k) {
        Arrays.sort(arr);
        int diff = arr[arr.length -1] - arr[0];

        for(int i =0;i<arr.length -1 ;i++){
            if(arr[i] < 0 ) continue;
            int max = Math.max(arr[arr.length - 1] - k, arr[i] + k);
            int min = Math.min(arr[0] + k, arr[i] - k);

            diff = Math.min(diff , max - min);
        }
        return diff;
    }
}
