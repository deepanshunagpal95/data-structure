package Arrays.day_1;

import java.util.HashMap;

public class Sort_012 {

    public static void main(String[] args) {
        Integer[] a = {0 ,2 ,1, 2, 0};
        Integer[] res = sort(a,a.length);
        for(int i =0;i< res.length;i++){
            System.out.println(res[i]);
        }
        int[] b = {0 ,2 ,1, 2, 0};
        sortGeeks(b, b.length);
    }


   public static Integer[] sort(Integer[] a, Integer n){
       HashMap<Integer, Integer> objectObjectHashMap = new HashMap<>();
       for(int i=0; i<n; i++){
           if(objectObjectHashMap.containsKey(a[i])){
               objectObjectHashMap.put(a[i] , objectObjectHashMap.get(a[i])+1);
           }   else{
               objectObjectHashMap.put(a[i] ,1);
           }
       }
       Integer res[] = new Integer[n];
       int zero = objectObjectHashMap.get(0);
       int count =0;
       for(int i =0;i<zero;i++){
           res[i]=0;
           count++;
       }
       Integer ones = objectObjectHashMap.get(1);
       Integer cuurentIndex=count;
      /*  for(int i =count;i<ones;i++){
            res[i]=1;
            countTwo++;
        }*/
       while(ones > 0){
           res[cuurentIndex] = 1;
           ones--;
           cuurentIndex++;
       }
       Integer twos = objectObjectHashMap.get(2);
       while(twos > 0){
           res[cuurentIndex] =2;
           twos--;
           cuurentIndex++;
       }

       return res;
    }

//complexity O(N)
    public static void sortGeeks(int arr[], int n){
        // Function to sort the array of 0s, 1s and 2s
            int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;

            // Count the number of 0s, 1s and 2s in the array
            for (i = 0; i < n; i++) {
                switch (arr[i]) {
                    case 0:
                        cnt0++;
                        break;
                    case 1:
                        cnt1++;
                        break;
                    case 2:
                        cnt2++;
                        break;
                }
            }

            // Update the array
            i = 0;

            // Store all the 0s in the beginning
            while (cnt0 > 0) {
                arr[i++] = 0;
                cnt0--;
            }

            // Then all the 1s
            while (cnt1 > 0) {
                arr[i++] = 1;
                cnt1--;
            }

            // Finally all the 2s
            while (cnt2 > 0) {
                arr[i++] = 2;
                cnt2--;
            }

            // Print the sorted array
            printArr(arr, n);
        }

    static void printArr(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }
}

