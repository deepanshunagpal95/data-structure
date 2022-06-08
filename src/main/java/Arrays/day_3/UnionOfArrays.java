package Arrays.day_3;

import util.ArrayUtil;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {

    public static void main(String[] args) {
        int[] arr2 = {5,3};
        System.out.println(union(ArrayUtil.getArr(),arr2));
    }

    public static int union(int[] arr, int[] arr2){

        Set<Integer> set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i =0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        return set.size();
    }
}
