package Arrays.day_15;

import java.util.HashSet;

public class SubarraySumEqualToZero {

    public static void main(String[] args) {
        int arr[] = {4, 2 ,  -3 ,  1 , 6};
        System.out.println(checkIfSubArrExists(arr,arr.length));
    }
    public static boolean checkIfSubArrExists(int[] arr,int n) {
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 0 || sum == 0 || hs.contains(sum)) {
                return true;
            } else {
                hs.add(sum);
            }
        }
        return false;
    }
}
