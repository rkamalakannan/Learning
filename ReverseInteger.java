class Solution {
    public int reverse(int x) {
        
        long rev_num = 0;
        while (x !=0) {
            rev_num = rev_num * 10 + x % 10;
            x = x / 10;
        }

        return rev_num > Integer.MAX_VALUE || rev_num < Integer.MIN_VALUE ? 0: (int) rev_num;
        
        
    }

    public static void main(String[] args) {

        Solution sol = new Solution();
        sol.reverse(1534236469);

    }
}