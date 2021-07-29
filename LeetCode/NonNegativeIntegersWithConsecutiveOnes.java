import java.util.*;

class Solution {
    public int findIntegers(int n) {

        
        
        int count = 0;
        int result = 0;
        String toBinary = "";

        toBinary = Integer.toBinaryString(n);

        if (toBinary.contains("11")) {
            count++;
        }
        
        n--;
        findIntegers(n);
        if(n==n)
        {

        }

    
        return count;

        
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.findIntegers(5);
    }
}