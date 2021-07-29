import java.util.*;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        int sum = 0;
        int count= 0;

        Arrays.sort(nums);

        List<Integer> resultNumsList = new ArrayList<>();
        List<List<Integer>> finalResultList = new ArrayList<>();
    

        for (int i = 0; i < nums.length; i++) {

            sum = sum+nums[i];
            resultNumsList.add(nums[i]);
            for (int j = i+1; j > nums.length; j--) {


                sum=sum+nums[j];
                resultNumsList.add(nums[j]);
                if(count>=2){
                    count =0;
                    break;
                }

                count++;
     
            }


            if(sum==target){
                finalResultList.add(resultNumsList);
            }

            resultNumsList.clear();
            sum=0;
            
        }


        System.out.println(finalResultList);

        return finalResultList;
    }

    public static void main(String[] args) {
        FourSum solution = new FourSum();
        int[] nums = {1,0,-1,0,-2,2 };

        solution.fourSum(nums, 0);
    }
}
