
// you can also use imports, for example:
import java.util.*;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public static int solution(int N) {

        char[] toBinaryString = Integer.toBinaryString(N).toCharArray();

        char checkBinaryValue = 'x';
        List<Integer> countList = new ArrayList<>();
        int count = 0;
        int isEndCount = 0;


        for (int i = 0; i < toBinaryString.length; i++) {
            if (toBinaryString[i] == '1') {
                for (int j = i + 1; j < toBinaryString.length; j++) {
                    if (toBinaryString[j] == '0') {
                        checkBinaryValue = toBinaryString[j];
                        count++;
                    } else {
                        isEndCount++;
                        int totalCount = count;
                        countList.add(totalCount);
                        count = 0;
                        break;
                        
                    }

                }

            }

        }

        if(isEndCount==0 )
        {
          return  N=0;
        }
        else {
            
            Integer max = Collections.max(countList);
            N = max;

        }

        System.out.println("N:" + N);
        return N;
        // write your code in Java SE 11

    }

    public static void main(String[] args) {
        solution(328);

    }
}
