package Arrays.day_23;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ThreeWayPartitioning {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3, 4};
        partition(a , 1 , 2);
        int[] ints = partitionTwo(a, 1, 2);
        System.out.println("---------------");
        for(int i =0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }
       //O(n)
    public static int[] partitionTwo(int[] nums , int lowVal,int highVal){

        // Declaring 3 queues
        Queue<Integer> before = new LinkedList<>();
        Queue<Integer> same = new LinkedList<>();
        Queue<Integer> after = new LinkedList<>();

        // Traverse the array elements one by one
        for (int i = 0; i < nums.length; i++) {

            // If the element is
            // less than pivot range
            // insert it into queue before
            if (nums[i] < lowVal)
                before.add(nums[i]);

                // Else If the element is
                // in between pivot range
                // insert it into queue same
            else if (nums[i] > highVal)
                after.add(nums[i]);

                // Else If the element is
                // less than pivot range
                // insert it into queue after
            else
                same.add(nums[i]);
        }

        int k = 0;
        // Now insert all elements
        // in queue before and
        // insert into final vector
        while (before.size() > 0) {
            nums[k++] = before.poll();
        }

        // Now insert all elements
        // in queue same and
        // insert into final vector
        while (same.size() > 0) {
            nums[k++] = same.poll();
        }

        // Now insert all elements
        // in queue after and
        // insert into final vector
        while (after.size() > 0) {
            nums[k++] = after.poll();
        }

        // Return the final vector
        return nums;
    }

 //O(nlogn)
    public static void partition(int arr[] , int a , int b){
         int[] temp = new int[arr.length];
         Arrays.sort(arr);
         int index = 0;
         for(int i =0;i<arr.length;i++){
             if(arr[i]< a){

             }else{
                 index = i;
                 break;
             }
         }

         for(int i = 0;i<index;i++){
             temp[i] = arr[i];
         }
         int index2 = 0;
        for(int i =index;i<arr.length;i++){
            if(arr[i]> a && arr[i]< b){

            }else{
                index2 = i;
            }
        }
        for(int i = index;i<index2;i++){
            temp[i] = arr[i];
        }
        int index3 = 0;
        for(int i =index2;i<arr.length;i++){
            if(arr[i]> a && arr[i]< b){

            }else{
                index3 = i;
            }
        }
        for(int i = index2;i<arr.length;i++){
            temp[i] = arr[i];
        }
         arr = temp.clone();
        for (int i =0;i<temp.length;i++)
        System.out.println(temp[i]);

    }
}
