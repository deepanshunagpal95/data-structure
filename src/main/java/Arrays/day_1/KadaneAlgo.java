package Arrays.day_1;

public class KadaneAlgo {

    public static void main(String[] args) {

        int[] a =  {1,2,3,-2,5};
        System.out.println(kadane(a));
    }

    public static int kadane(int[] arr){

        int maxSum = 0;
        int currentSum = 0;
        for(int i =0;i< arr.length;i++){
            currentSum = currentSum + arr[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if (maxSum < 0)
                maxSum = 0;
        }
        return  maxSum;
    }
}
