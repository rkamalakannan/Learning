import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {

                sum = nums[i] + nums[j];    
                if(sum == target) 
                {
                    int[] result = {i,j};
                    nums  = result;

                }             
            }       
            

        }

    

        

        return nums;      
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,7,11,15};
        twoSum(nums,9);
    }
}