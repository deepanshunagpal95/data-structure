package Arrays.day_12;

import java.util.*;

public class FindCommonInThreeArrays {
    public static void main(String[] args) {
        int []A = {1, 5, 10, 20, 40, 80};
        int []B = {6, 7, 20, 80, 100};
        int []C = {3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println(getCommon(A,B,C,A.length,B.length,C.length));
    }

    public static List<Integer> getCommon(int A[], int B[], int C[], int n1, int n2, int n3){

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new LinkedHashSet<>();

        for(int i = 0;i<n1;i++){
            set1.add(A[i]);
        }
        for(int i = 0;i<n2;i++){
            set2.add(B[i]);
        }
        for(int i = 0;i<n3;i++){
            if(set1.contains(C[i]) && set2.contains(C[i])){
                if(set3.contains(C[i]) == false){
                    set3.add(C[i]);
                }
            }
        }
        return new ArrayList<>(set3);
    }
}
