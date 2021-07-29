import java.util.Arrays;

public class Arrayrotation {

    public static int[] solution(int[] A, int K) {

        System.out.println(Arrays.toString(A));
        int temp;
        for (int i = 0; i < A.length; i++) {

            temp = A[i];
            System.out.println("temp:"+temp);
            for (int j = i+1; j < A.length; j++) {
                A[j] = temp;
            }

            System.out.println(Arrays.toString(A));

                        
        }

        // System.out.print(Arrays.toString(A));
        return A;

    }

    public static void main(String[] args) {
        int[] A = { 3, 8, 9, 7, 6 };
        solution(A, 3);
    }

}
