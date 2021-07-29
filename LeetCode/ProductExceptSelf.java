import java.util.Arrays;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int[] product = nums.clone();
        int multiply = 1;

        for (int i = 0; i < nums.length; i++) {

            multiply = 1;
            for (int j = nums.length - 1; j > -1  ; j--) {
                
                if(i!=j)
                    multiply = nums[j] * multiply;

            }
            product[i] = multiply;

        }
        return product;

    }

    public static void main(String[] args) {
        ProductExceptSelf obj = new ProductExceptSelf();
        int[] nums = {1,2,3,4 };
        obj.productExceptSelf(nums);
    }

}
