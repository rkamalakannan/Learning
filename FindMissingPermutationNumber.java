import java.util.Arrays;
import java.util.Queue;

public class FindMissingPermutationNumber {

    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);
        int smallElement = A[0];
        int highestElement = A[A.length - 1];
        int count = A[0];
        int missingElement = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println(i);
            if (count != A[i]) {
                return  missingElement = count;               
            }
            count++;
        }
        return missingElement;

    }

    public static void main(String[] args) {
        FindMissingPermutationNumber number = new FindMissingPermutationNumber();
        int[] A = { 3, 5, 6, 7 };
        number.solution(A);
    }

}
