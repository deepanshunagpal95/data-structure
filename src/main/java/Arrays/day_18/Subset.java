package Arrays.day_18;


import java.util.*;

public class Subset {

    public static void main(String[] args) {
        long a1[] = {1, 2, 3, 4, 5, 6};
        long a2[] = {1, 2, 4};
        System.out.println(isSubset(a1, a2));
    }

    public static String isSubset( long a1[], long a2[]) {
        Map<Long, Integer> mp = new HashMap<>();
        for (int i = 0; i < a1.length; i++) {
            mp.put(a1[i], 1);
        }
        for (int i = 0; i < a2.length; i++) {
            Integer val = mp.get(a2[i]);
            if (val != null) {
                continue;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
