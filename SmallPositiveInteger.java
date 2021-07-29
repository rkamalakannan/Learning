import java.util.List;
import java.util.*;

public class SmallPositiveInteger {
    public static int solution() {

        int[] A = { 1, 3, 6, 4, 1, 2 };

        List<Integer> maxList = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {

            maxList.add(A[i]);
        }

        maxList.sort(null);
        int secondHighest = maxList.get(1);

        int max = maxList.get(maxList.size());
        

    {
        return max = 1;
    }

    // write your code in Java SE 8
    }

    public static void main(String[] args) {
        solution();
    }

}
