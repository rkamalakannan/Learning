import java.util.List;
import java.util.*;

public class Stringconcat {

    public static int solution(int[] A, int[] B) {

        int midA = A.length / 2;
        int midB = B.length / 2;
        int sumA= 0;
        int sumB = 0;
        int countA = 1;
        int countB = 1;
        int fair = 0;
        List<Integer> sumListA = new ArrayList<>();
        List<Integer> sumListB= new ArrayList<>();


        for (int i = 0; i <= midA; i++) {

            for (int j = 0; j <= midA; j++) {

                sumA = sumA + A[j];

            }
            sumListA.add(sumA);
            sumA = 0;
            countA++;
            // if (countA > midA) {
            //     break;

            // }
        }

        for (int i = 0; i <= midB; i++) {

            for (int j = 0; j <= midB; j++) {

                sumB = sumB + B[j];

            }
            sumListB.add(sumB);
            sumB = 0;
            countB++;
            // if (countB > midB) {
            //     break;

            // }
        }
        
        if(sumListA.size() == sumListB.size())
        {
            fair =  2;
        }

        //  if(sumA<0 && sumB <0)
        // {
        //     fair =1;
        // }

        
        
        return fair;

    }

    public static void main(String[] args) {
        int[] A = { 2, -2, -3, 3 };
        int[] B = { 0, 0, 4, -4 };
        solution(A, B);
    }

}
