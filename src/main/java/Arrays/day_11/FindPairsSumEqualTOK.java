package Arrays.day_11;

import util.ArrayUtil;

import java.util.HashMap;
import java.util.Map;
//https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
public class FindPairsSumEqualTOK {

    public static void main(String[] args) {
        final Integer[] arr =  {5,3,2,6,1};
        System.out.println(pairsCount(arr , arr.length , 8 ));
    }
    public static int pairsCount(Integer[] arr , int n , int k){

        Map<Integer,Integer> mp = new HashMap<>();
        int count = 0;
        for(int i =0 ;i<n;i++){

            if(mp.containsKey(k - arr[i])){
                count +=mp.get(k- arr[i]);

            }
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        return count;
    }
}
