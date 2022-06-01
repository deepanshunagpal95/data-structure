package Recursion.day_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Subsequence {

    public static void main(String[] args) {

        int arr[] = {3, 1, 2};
        int size = arr.length;
        Stack<Integer> st = new Stack<>();
        int index = 0;
        int sum = 5;
        print(arr , size , st ,index , sum);
    }

    public static void print(int arr[] , int size , Stack s , int index , int sum ){

        if(size == index) {
            //int ss = 0;
           // List<Integer> l = new ArrayList<>();
            for (Object si :s) {
                //ss+=(Integer) si;
              //  l.add((Integer) si);
                System.out.println(si);
            }
           /* if(ss==sum){
                System.out.println(l);
            }*/
            System.out.println("--------");
            if(s.size() == 0) {
                System.out.println(" {}");
            }
            return;
        }
        // Not take
        print(arr , size , s , index +1 , sum);
        s.push(arr[index]);
        // Take
        print(arr , size , s ,index+1, sum);
        s.pop();
    }
}

