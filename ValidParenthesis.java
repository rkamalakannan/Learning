import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        String split = "";
        Stack stack = new Stack();
        boolean isValid = false;
        HashMap<Character, Character> vMap = new HashMap<>();
        vMap.put(')', '(');
        vMap.put('}', '{');
        vMap.put(']', '[');

        for (int i = 0; i < s.length(); i++) {

            stack.push(s.charAt(i));

            for (int j = 1; j < s.length(); j++) {
                if (vMap.containsValue(s.charAt(j))) {
                    stack.push(s.charAt(j));
                    System.out.print(stack.lastElement());

                }

                else if (stack.empty() == false && vMap.get(s.charAt(j)) == stack.lastElement())
                    stack.pop();
                else
                    stack.push(s.charAt(j));

            }

            if (stack.isEmpty()) {
                return isValid = true;
            }

            return isValid = false;
        }
        return isValid;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isValid("([)]");

    }
}