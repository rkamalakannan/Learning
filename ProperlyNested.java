// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 11

        // S ={[()()]}
        Stack stack = new Stack();

        if(S.isEmpty()) return 1;

        HashMap<Character,Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');


        stack.push(S.charAt(0));

      for (int i = 1; i < S.length(); i++) {

        if(!stack.isEmpty())
        {

            if(!stack.peek().equals(map.get(S.charAt(i))))
            {
                stack.push(S.charAt(i));

            }
            else
            {
                stack.pop();
            }

        }
        else
        {
            stack.push(S.charAt(i));

        }


        }
  
        

        if(stack.size()>0)
        {
            return 0;

        }
          

    return 1;

        
    }

    public static void main(String[] args) {

        Solution sol = new Solution();
        sol.solution("())(()");
        
    }


}
