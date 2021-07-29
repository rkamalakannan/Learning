import java.util.HashMap;

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;

     for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {

                if (nums[i] != nums[j]) {

                    nums[j] = nums[j];
                }

            }
        }

        count = nums.length;
        return count;

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 1, 2 };
        sol.removeDuplicates(nums);

    }
}