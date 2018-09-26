package lessons.two;

import java.util.StringJoiner;

public class CyclicRotation {

    public static void main(String[] args) {

        int[] a = { 1, 2, -5, -9, 6, 56 };
        int k = 1;
        
        int[] result = solution(a, k);

        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < result.length; i++) {
            sj.add(Integer.toString(result[i]));
        }

        System.out.println("Original: " + sj.toString());
    }

    public static int[] solution(int[] a, int k) {

        if (a.length <= 1) {
            return a;
        }

        if (k <= 0) {
            return a;
        }

        for (int i = 0; i < k; i++) {
            int[] b = new int[a.length];
            for (int j = 1; j < a.length; j++) {
                b[j] = a[j - 1];
            }
            b[0] = a[a.length - 1];
            a = b;
        }
        return a;
    }

}
