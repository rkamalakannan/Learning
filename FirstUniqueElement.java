import java.util.*;

public class FirstUniqueElement {
    public int solution(int[] A) {

        int count = 0;
        int uniquePosition = 0;
        HashMap<String, Integer> vMap = new HashMap<String, Integer>();

        for (int i = 0; i < A.length; i++) {
            int firstElement = A[i];

            for (int j = 0; j < A.length; j++) {

                if (firstElement == A[j]) {
                    count++;

                }

              
            }

            if (count == 1)
            vMap.put(i +"Position of " + A[i], A[i]);
            

            count = 0;
        }
        
        List<Integer> countList = new ArrayList<>(vMap.values());
        // Collections.sort(countList);
        if (vMap.isEmpty() == true) {
            return uniquePosition = -1;

        }

        uniquePosition = countList.get(0);
        return uniquePosition;
    }

    public static void main(String[] args) {
        FirstUniqueElement firstUniqueElement = new FirstUniqueElement();
        int[] A = {0, 0, 8, 0, 2, 2, 2, 6 };
        firstUniqueElement.solution(A);
    }

}
