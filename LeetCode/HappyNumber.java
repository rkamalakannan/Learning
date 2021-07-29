import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    Set<Integer> set = new HashSet<>();

    public boolean addSum(int sum) {
        if (set.contains(sum)) {
            return true;
        }
        set.add(sum);
        return false;

    }

    public boolean isHappy(int n) {

        boolean isHappy = false;

        String strNumber = String.valueOf(n);
        Double sum = 0.0;

        for (int i = 0; i < strNumber.length(); i++) {

            Double number = Double.parseDouble(Character.toString(strNumber.charAt(i)));
            sum = sum + Math.pow(number, 2);
        }

        n = sum.intValue();

        boolean ifExists = addSum(n);

        if (ifExists == true)
        {
            isHappy = false;
        }


        if (n == 1)
            isHappy = true;

        if (isHappy(n) != true && ifExists!=false) {
            isHappy(n);
        }

        
        return isHappy;
    }

    public static void main(String[] args) {

        HappyNumber sol = new HappyNumber();
        sol.isHappy(2);

    }

}
