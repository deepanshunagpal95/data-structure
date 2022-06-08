package Arrays.day_4;

import util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateByOne {

    public static void main(String[] args) {

        ArrayUtil.print(rotate(ArrayUtil.getArr(), ArrayUtil.getArr().length));
        System.out.println("Without extra space");
        ArrayUtil.print(rotateWithoutExtra(ArrayUtil.getArr(), ArrayUtil.getArr().length));
    }

    // With extra Space
    public static int[] rotate(int[] arr, int n) {
        int[] arr2 = new int[arr.length];
        arr2[0] = arr[n - 1];
        for (int i = 0; i < arr.length - 2; i++) {
            arr2[i + 1] = arr[i];
        }
        arr2[n - 1] = arr[n - 2];
        arr = Arrays.copyOf(arr2, arr2.length);
        return arr;
    }

// int arr[] = {}
    public static int[] rotateWithoutExtra(int[] arr, int n) {
        int x = arr[arr.length - 1], i;
        for (i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = x;
        return arr;
    }
}
