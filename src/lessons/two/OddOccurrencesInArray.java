package lessons.two;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        
        int[] a = { 1, 2, 1, 2, 6 };
        
        System.out.println(solution(a));
    }

    private static int solution(int[] a) {

        Map<Integer, Integer> compared = new HashMap<>();
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            if (!compared.containsKey(i) && !compared.containsValue(i)) {
                int j = i + 1;
                boolean paired = false;
                while (j < a.length && !paired) {
                    if (a[i] == a[j]) {
                        paired = true;
                        compared.put(i, j);
                    }
                    j++;
                }
                if (!paired) {
                    result = a[i];
                }
            }
        }

        return result;
    }

}
