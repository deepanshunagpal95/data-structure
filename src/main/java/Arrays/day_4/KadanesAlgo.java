package Arrays.day_4;

public class KadanesAlgo {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array2 = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(max(array2));
        int[] array3 = {-1, -2, -3, -4};
        System.out.println(maxSubArraySum(array3,array3.length));
    }

    public static int max(int[] arr){
        int current_sum = 0;
        int max_So_far = 0;

        for(int i =0;i<arr.length-1;i++){
            current_sum+=arr[i];
            max_So_far = Math.max(current_sum,max_So_far);
            if(current_sum < 0){
                current_sum = 0;
            }

        }
        return max_So_far;
    }

// int[] array3 = {-1, -2, -3, -4};
    static int maxSubArraySum(int a[], int size) {
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a[i], curr_max + a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
}
