import java.util.*;

public class DistinctArrayValue {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int count = 0;
        List<Integer> countList = new ArrayList<>();
        HashMap<String,Integer> vMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int firstElement = A[i];

            for (int j = 0; j < A.length; j++) {

                if (firstElement == A[j]) {
                    count++;
                    vMap.put(A[j]+" Repeated", count );
                }

            }
            count = 0;
            


        }

        int distinct = vMap.size();

        return distinct;
    }



    public static void main(String[] args) {
        DistinctArrayValue distinctArrayValue = new DistinctArrayValue();
        int[] A = { 2, 1, 1, 2, 3, 1 };
        distinctArrayValue.solution(A);
    }
}
