import java.util.*;

class Solution {
    public int solution(int[] A) {
        int result = 0;
        int count = 0;

        HashMap<Integer, Integer> vMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            for (int k = 1; k < A.length; k++) {

                if (A[i] == A[k]) {

                    vMap.put(i, 1);
                }

                i++;

            }

        }
        result = vMap.size();

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = { 2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5 };
        sol.solution(A);
    }
}
