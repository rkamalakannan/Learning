import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String last = s.substring(s.length()-k ,s.length());

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        List<String> newArray = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i);
            if(sub.length()>=k)
                newArray.add(sub.substring(0, k));         
        }
        
        newArray.sort(null);
        smallest = newArray.get(0);
        largest = newArray.get(newArray.size()-1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
