package Arrays.Day_8;


import util.ArrayUtil;

import java.util.Arrays;

//Merge Two Sorted Arrays Without using extra space
public class MergeTwoSortedArrays {

    public static void main(String[] args) {
       int  ar1[] = {1, 5, 9, 10, 15, 20};
       int ar2[] = {2, 3, 8, 13};
        merge(ar1,ar2,ar1.length,ar2.length);
    }

    public static void merge(int[] arr1 , int[] arr2, int m , int n){

        int i =0, j = 0 , k = m-1;

        while(i < m && j < n){
            if(arr1[i]<arr2[j]){
                i++;
            }else{

                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                k--;
                j++;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayUtil.print(arr1);
        ArrayUtil.print(arr2);
    }
}
