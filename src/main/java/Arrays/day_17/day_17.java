package Arrays.day_17;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.geeksforgeeks.org/given-an-array-of-of-size-n-finds-all-the-elements-that-appear-more-than-nk-times/
 */
public class day_17 {
    public static void main(String[] args) {
        int a[] = new int[] { 1, 1, 2, 2, 3, 5, 4,
                2, 2, 3, 1, 1, 1 };
        int n = 12;
        int k = 4;
        print(a,n,k);
    }

    public static void print(int[] arr , int n , int k){

        Map<Integer,Integer> mp =new HashMap<>();
        for(int i =0;i<n;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        int val = n/k;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            Integer value = entry.getValue();
            if(value>val){
                System.out.println(entry.getKey());
            }
        }


    }
}
