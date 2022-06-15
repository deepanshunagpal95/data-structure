package Arrays.day_16;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {
        int N = 7;
        int a[] = {2,6,1,9,4,5,3};
        System.out.println(findLongestConseqSubseq(a,N));
    }
    static int findLongestConseqSubseq(int arr[], int N) {
        // add your code here
        Arrays.sort(arr);
        int newSize = removeDuplicates(arr, N);
        int currentCount = 0;
        int maxCount = 0;
        for (int i = 1; i < newSize; i++) {
            int res = arr[i] - arr[i - 1];
            if (res == 1) {
                currentCount++;
                maxCount = Math.max(currentCount, maxCount);
            } else {
                currentCount = 0;
            }

        }
        return maxCount + 1;
    }
    // returns new size of modified array.
    static int removeDuplicates(int arr[], int n)
    {
        // Return, if array is empty or contains a single
        // element
        if (n == 0 || n == 1)
            return n;

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            // If current element is not equal to next
            // element then store that current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];

        // Store the last element as whether it is unique or
        // repeated, it hasn't stored previously
        temp[j++] = arr[n - 1];

        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }
}
