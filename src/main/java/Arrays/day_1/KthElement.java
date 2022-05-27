package Arrays.day_1;

import java.util.Arrays;
import java.util.Collections;

public class KthElement {
    public static void main(String[] args) {
        System.out.println("entering");
        Integer arr [] = {7 ,10 ,  4 , 20 ,15};

        final int i = kthElement(arr, 0, arr.length  , 4 );
        System.out.println(i);
    }
    //adding comment
    private static int kthElement(Integer[] arr, int l ,int r , int k){
        Arrays.sort(arr , Collections.reverseOrder());
        final int i = r - k;
        return arr[i];
    }
}
