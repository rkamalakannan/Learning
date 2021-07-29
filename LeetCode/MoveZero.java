import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        Arrays.sort(nums);
        
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Solution sol = new Solution();
        sol.moveZeroes(nums);
    }
}
