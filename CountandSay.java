import java.util.concurrent.CountDownLatch;

class Solution {
    public String countAndSay(int n) {

        String countsayString = "";

        int count = 0;

        if (n == 1)
            countsayString = "1";
        
        for (int i = 1; i < n; i++) {

            String counString = countAndSay(n - 1);

            countsayString = countsayString.concat(counString);

        }

        return countsayString;

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.countAndSay(4);
    }

}
