import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> vMap = new HashMap<>();

        Arrays.sort(nums);
        Stack stack = new Stack();
        int result = 0;

        for (int i = 0; i < nums.length; i++) {

            while (i + 1 != nums.length) {
                if (nums[i] != nums[i + 1]) {
                    stack.push(nums[i]);
                    return result = nums[i];
                }
                break;

            }
            result = nums[i];

            i++;

        }

        return result;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = { 1 };
        singleNumber.singleNumber(nums);
    }
}
