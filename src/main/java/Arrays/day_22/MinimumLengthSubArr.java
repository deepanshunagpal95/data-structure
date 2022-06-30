package Arrays.day_22;

public class MinimumLengthSubArr {

    public static void main(String[] args) {
        int arr1[] = { 1, 4, 45, 6, 10, 19 };
        int x = 51;
        int n1 = arr1.length;
        int res1 = smallestSubWithSum(arr1, n1, x);
        if (res1 == n1 + 1)
            System.out.println("Not Possible");
        else
            System.out.println(res1);
    }

    private static int smallestSubWithSum(int[] arr1, int n1, int x) {
        int current_sum = 0;
        int min_length = n1+1;
        int start = 0 , end = 0;
        while(end < n1){
            while(current_sum<=x && end<n1){
                current_sum+=arr1[end++];
            }
            while(current_sum > x && start<n1){
                if(end - start < min_length){
                    min_length = end - start;
                }

                current_sum-= arr1[start++];
            }

        }

        return min_length;
    }
}
