class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;
        int temp = 0;
        int size = nums.length;
        for (int i = size - 1; i >=0 ; i--) {

            if(nums[i]==val)
            {
                temp  = nums[i];
                nums[i] = nums[size-1];
                nums[size-1] = temp;
                size--;
          
            }
         

            k = size;
            
        }
        return k;
        
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {0,2,3,4,5,3,1,0};
        sol.removeElement(nums, 3);

    }
}