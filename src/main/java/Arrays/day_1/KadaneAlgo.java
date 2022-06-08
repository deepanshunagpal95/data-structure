package Arrays.day_1;

import java.util.Queue;

public class KadaneAlgo {

    public static void main(String[] args) {

        int[] a =  {1,2,3,-2,5};
        int[] array2 = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] array3 = {-1, -2, -3, -4};
        int[] array4 = {-5, -3, -2, -4};
        System.out.println(kadane(a));
        System.out.println(kadane(array2));
        System.out.println(kadane(array3));
        System.out.println(kadane(array4));

        System.out.println(kadaneAll(a));
        System.out.println(kadaneAll(array2));
        System.out.println(kadaneAll(array3));
        System.out.println(kadaneAll(array4));
        System.out.println("Brute force -------------");
        System.out.println(bruteForce(a));
        System.out.println(bruteForce(array2));
        System.out.println(bruteForce(array3));
        System.out.println(bruteForce(array4));
    }
     public  static int bruteForce(int arr[]){
     int max =0;
        for(int i =0;i<arr.length;i++){
            int sum =0;
            for(int j =i;j<arr.length;j++){
                 sum +=arr[j];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
}
//cant handle All negative array
    public static int kadane(int[] arr){

        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int i =0;i<arr.length;i++){
            curr_sum = curr_sum +arr[i];
            if(curr_sum > max_sum){
                max_sum = curr_sum;
            }
            if (curr_sum<0)
                curr_sum=0;

        }
        return max_sum;
    }

    public static int kadaneAll(int[] arr){

        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int i =0;i<arr.length;i++) {
            curr_sum = Math.max(curr_sum + arr[i], arr[i]);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
        }

        return max_sum;
    }

    // iteration 1 CS = 1 max = 1
    // cs = 3 max 3
    // cs = 6 max 6
    // cs = 4  max 6
    // cs =9 max 9
    // 9
}

