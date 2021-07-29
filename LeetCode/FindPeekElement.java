import java.util.Stack;
import java.util.*;

public class FindPeekElement {
    public int findPeakElement(int[] nums) {

        int[] copyNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int peekElementIndex = 0;
        int peekElement = nums[nums.length-1];

        for (int i = 0; i < copyNums.length; i++) {

            if(peekElement == copyNums[i])
            {
                peekElementIndex = i;
                
            }  
        }
       
        
        // System.out.println(stack);

        // vMap.keySet();

     return peekElementIndex;


        
    }
    
    public static void main(String[] args) {
        FindPeekElement findPeekElement = new FindPeekElement();
        int[] nums = {1,2,3,1};
        findPeekElement.findPeakElement(nums);
        }
}
