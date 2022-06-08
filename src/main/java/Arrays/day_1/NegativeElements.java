package Arrays.day_1;

import util.ArrayUtil;

/**
 * This problem is to move all the negative elements to left and positive elements to right
 */
public class NegativeElements {

    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6};
        ArrayUtil.print(move(arr));
    }

    public static int[] move(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {

            if (arr[left] >0  && arr[right] < 0) {
                //swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] < 0 && arr[right] < 0) {
                left++;
            } else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            } else {
                left++;
                right--;
            }

        }
        return arr;
    }
}
