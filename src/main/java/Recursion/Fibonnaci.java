package Recursion;

public class Fibonnaci {


    public static void main(String[] args) {

        System.out.println(fibo(2));
    }

    private static int fibo(int n){
        if(n<=1) {
            return n;
        }
       int last =  fibo(n-1);
        int secondlast = fibo(n-2);
        return last + secondlast;
    }
}
