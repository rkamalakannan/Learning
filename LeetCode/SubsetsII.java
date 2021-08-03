import java.util.*;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<Integer> powerSets = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());


        for (int i = 0; i < nums.length; i++) {
            powerSets.add(nums[i]);
            result.add(powerSets);
            System.out.println(result);
            for (int j = i+1; j < nums.length; j++) {
                
                powerSets.add(nums[j]);
                powerSets.add(nums[j+1]); 
                result.add(powerSets);
                System.out.println(result);
            }

        }

        // result.add(powerSets);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        SubsetsII sol = new SubsetsII();
        int[] nums = { 1, 2, 2 };
        sol.subsetsWithDup(nums);
    }
}