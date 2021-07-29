import java.util.Stack;

class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int sum = 0;

        Stack stack = new Stack();
        stack.setSize(4);

        while (stack.isEmpty() == true) {

            for (int i = 0; i < nums.length; i++) {

                stack.push(nums[i]);

            }

        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        FourSum solution = new FourSum();
        solution.fourSum(nums, 0);
    }
}