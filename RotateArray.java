import java.util.*;

class Solution {
    public static String solution(String s) {
        char c = s.charAt(0);
        if (c >= 'A' && c <= 'Z') { // please fix condition
            return "upper";
        } else if (c >= 'a' && c <= 'z') { // please fix condition
            return "lower";
        } else if (c > -1) {
            if (c>-1) {
                return "digit";
            }
            return "other";

        } else {
            return "other";
        }
    }

    public static void main(String[] args) {
        solution("-12345");
    }
}
