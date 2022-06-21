package Arrays.day_19;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindTripletsSumEqualTOK {

    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 1, 6, 9};
        System.out.println(findTriplets(arr,arr.length,24));
        System.out.println("second Approach O(n * n) " + findTripletsEqualToK(arr,arr.length,24));
        System.out.println("second Approach O(n * n * n) " + findTripletsNaiveApproach(arr,arr.length,24));

    }
//O(n3)
    public  static boolean findTripletsNaiveApproach(int[] arr , int n , int k) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int p = j + 1; p < n; p++) {
                    if (arr[i] + arr[j] + arr[p] == k) {
                        return true;
                    }

                }
            }

        }
        return false;
    }
   //(n*2) 12, 3, 4, 1, 6, 9
    public static boolean findTripletsEqualToK(int[] arr , int n , int k){
        Arrays.sort(arr);// nlogn + n2
        for(int i =0;i<arr.length - 2 ;i++) {
            int low = i+1;
            int high = n-1;
            int sum = k-arr[i];
            while (low < high) {
                if (arr[low] + arr[high] == sum) {
                    return true;
                } else if (arr[low] + arr[high] < sum) {
                    low++;
                } else high--;
            }
        }

        return false;

    }
    // will handle -ve elements and sum is equal to zero problem
    public static List<List<Integer>> findTriplets(int[] arr , int n, int k){
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(arr);

        for(int i =0;i<arr.length - 2 ;i++) {

            if(i ==0 || (i>0 && arr[i]!=arr[i-1])) {
                int low = i+1;
                int high = n-1;
                int sum = k-arr[i];//0 -arr[i]
                while (low < high) {

                    if (arr[low] + arr[high] == sum) {
                        res.add(Arrays.asList(arr[i], arr[low], arr[high]));
                        while (low < high && arr[low] == arr[low + 1]) low++;
                        while (low < high && arr[high] == arr[high - 1]) high--;
                        low++;
                        high--;

                    } else if (arr[low] + arr[high] < sum) {
                        low++;

                    } else high--;
                }
            }
        }
        return res;
    }
}
