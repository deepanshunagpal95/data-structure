package Arrays.day_25;

public class PalindromicArray {

    public static void main(String[] args) {
        int arr[] = {111 ,  222 , 333 , 444 , 555};
        System.out.println( find(arr,arr.length));
    }

    public static int find(int[] arr, int n){
            int counter  = 0;
            //add code here.
            for(int i =0;i<arr.length;i++){

                int num = arr[i];
                int reversed = 0;
                while(num != 0) {

                    // get last digit from num
                    int digit = num % 10;
                    reversed = reversed * 10 + digit;
                    if(arr[i] == reversed){
                        counter++;
                    }else{
                        break;
                    }
                    // remove the last digit from num
                    num /= 10;
                }


            }
            if(counter == arr.length){
                return 1;
            }else{
                return 0;
            }
        }
    }

