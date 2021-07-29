import java.util.HashMap;

public class DuplicateNumber {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> vMap = new HashMap<>();
        
        for(int i=0; i<nums.length;i++)
        {
            vMap.put(nums[i],nums[i]);
        }
        
        if(vMap.size()==nums.length)
        {
            return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        DuplicateNumber duplicateNumber = new DuplicateNumber();
        int[] nums = {1,2,3,1};
        duplicateNumber.containsDuplicate(nums);
        
    }
}
