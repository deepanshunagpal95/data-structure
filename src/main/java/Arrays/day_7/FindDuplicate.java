package Arrays.day_7;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        //System.out.println(findDuplicate(nums));
        System.out.println(findDuplicateNegation(nums));
    }
     //n*n Approach
    public static int findDuplicate(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (i == nums.length) {
                    break;
                }

                if (nums[i] == nums[j]) {
                    result = nums[i];
                    break;
                }

            }
        }
        return result;
    }

    //using n and extra space
    public static int findDuplicateUsingHashSet(int[] nums){
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for(int i =0;i<nums.length;i++){

            if(set.add(nums[i])){

            }
            else{
                result = nums[i];
                break;
            }

        }
        return result;

    }

    public static int findDuplicateNegation(int[] nums){
        // If Array Length is zero the just return 0
        if(nums.length == 0) {
            return 0;
        }

        // Traverse Loop for every array elements
        for(int i = 0; i < nums.length ;i++) {

            // Get Current value of element and consider it as an index and
            // In array change element value to negative at that particular index

            // If element at that particular index is Negative means this number is already been changed previously
            // Means our current element is duplicate so just return current element
            int index = Math.abs(nums[i]);
            if(nums[index] < 0){
                return index;
            }
            nums[index] = -nums[index];
        }
        return 0;
    }
}

