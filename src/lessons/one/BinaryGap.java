package lessons.one;

public class BinaryGap {

    public static void main(String[] args) {

        System.out.println(solution(32));
    }

    public static int solution(int number) {

        int biggestGap = 0;

        if (number > 0) {

            String binaryRepresentation = Integer.toBinaryString(number);

            int i = 0;
            while (i < binaryRepresentation.length() - 1) {

                boolean isClosed = false;
                int j = i + 1;
                int gap = 0;

                while (j < binaryRepresentation.length() && binaryRepresentation.charAt(j) == '0') {
                    gap += 1;
                    j += 1;
                }

                if (j < binaryRepresentation.length()) {
                    isClosed = binaryRepresentation.charAt(j) == '1' ? true : false;
                }

                if (isClosed) {
                    if (gap > biggestGap) {
                        biggestGap = gap;
                    }
                }

                i = j;

            }
        }

        return biggestGap;
    }

}
