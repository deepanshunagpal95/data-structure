package Arrays.day_6;

import util.ArrayUtil;

public class NumberOfJumps {

    public static void main(String[] args) {

        int[] arr = ArrayUtil.getArr();
        int jumps = jumps(arr, arr.length);
        System.out.println(jumps);
      int[]  arr2 = {1, 4, 3, 2, 6, 7};
        System.out.println(jumps(arr2, arr2.length));
        int[] arr3 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(jumps(arr3, arr3.length));

    }
    //1 2 3 4
    private static int jumps(int[] arr , int n){

        if(arr[0] == 0){
            return -1;
        }
        int jump = 0;
        for(int i =0;i<arr.length;){
            int currentIndex  = arr[i];
            i = i+currentIndex;
           jump++;

        }
        return jump;
    }
}
