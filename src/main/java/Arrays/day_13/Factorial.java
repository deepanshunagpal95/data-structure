package Arrays.day_13;

import java.math.BigInteger;
import java.util.ArrayList;

public class Factorial {

    public static void main(String[] args) {
        //System.out.println(fact(10));
        System.out.println(factorial(3));
    }

    public static ArrayList<Integer> fact(int n){
        BigInteger bigInteger = new BigInteger(String.valueOf(1));
       ArrayList<Integer> list = new ArrayList<>();
        for(int i =1;i<=n;i++){
            bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(i)));
        }
        final char[] chars = bigInteger.toString().toCharArray();
        for(int i =0;i<chars.length;i++){
            list.add(Integer.parseInt(String.valueOf(chars[i])));
        }
        return list;
    }


    // 5! = 5 * 4  =120
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        if(n ==1){
            return 1;
        }
        int ans = n * factorial(n-1);
        return ans;
    }
}
