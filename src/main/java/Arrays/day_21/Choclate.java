package Arrays.day_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Choclate {
    public static void main(String[] args) {
        /*List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(56);
        list.add(7);
        list.add(9);
        list.add(12);*/
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        System.out.println(min_diff(arr,5,arr.length));
    }
public  static long min_diff(int[] a , int m , int n){
    // your code here
    Arrays.sort(a);
    int mi_diff = Integer.MAX_VALUE;
    for(int i =0;i<a.length-m;i++){
        int min = a[m+i-1] - a[i];
        mi_diff = Math.min(min,mi_diff);
    }
    return mi_diff;
}

}
