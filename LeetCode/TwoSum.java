class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int firstElement = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            // sum = firstElement + nums[i];

            for (int j = 1; j < nums.length; j++) {

                if (i != j) {
                    sum = nums[i] + nums[j];
                }

                if (sum == target) {
                    return nums = new int[] { i, j };
                }

            }

        }

        return nums;

    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.twoSum(new int[] { 2, 5, 5, 11 }, 10);
    }
}