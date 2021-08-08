import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import jdk.nashorn.api.tree.ForInLoopTree;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A) {

        int sum = 0;
        int max = 0;
        List<Integer> sumList = new ArrayList<>();

        int rowCompleteSumCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (rowCompleteSumCount < 2) {
                sum = 0;
                for (int j = i; j <= 2 + i; j++) {
                    sum = sum + A[j];
                }
                if (sum > max) {
                    max = sum;
                }

                else {
                    int rowSum = 0;
                    boolean isDone = false;
                    for (int j = i; j <= i + 2; j++) {
                        if (isDone != true) {
                            A[j] = A[j] + 1; // increasing first element by 1
                            for (int j2 = i; j2 <= i + 2; j2++) {
                                rowSum = A[j2] + rowSum;
                                if (rowSum == max) {
                                    isDone = true;
                                    i = -3;
                                    rowCompleteSumCount++;
                                }
                            }
                        }
                    }

                }
                i = i + 2;
            }
        }

        return A;
        // write your code in Java SE 11
    }

    // 1 2 3
    // 4 1 1 
    // 2 3 1
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = { 0, 2, 3, 4, 1, 1, 1, 3, 1 };
        sol.solution(A);
        System.out.println(A.toString());


    }
}
