import java.util.Arrays;
import java.util.*;

public class ReduceArraySizeHalf {
    public int minSetSize(int[] arr) {

        HashMap<Integer, Integer> vMap = new HashMap<>();

        Stack stack = new Stack();

        for (int i = 0; i < arr.length; i++) {

            int n1 = arr[i];

            for (int j = 0; j < arr.length; j++) {
                int n2 = arr[j];

                if (n1 != arr[j] || n2 != arr[j]) {
                    stack.push(arr[j]);
                    
                }

            }

        }
        System.out.println(stack);

        return 0;

    }

    public static void main(String[] args) {

        ReduceArraySizeHalf reduceArraySizeHalf = new ReduceArraySizeHalf();
        int[] arr = { 3, 3, 3, 3, 5, 5, 5, 2, 2, 7 };
        reduceArraySizeHalf.minSetSize(arr);

    }
}
