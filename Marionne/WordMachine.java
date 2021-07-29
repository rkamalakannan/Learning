import java.util.Stack;

class Solution {

    Stack stack = new Stack<>();

    public void pop() {
        stack.pop();

    }

    public void dup() {
        int topMostElement = Integer.parseInt(stack.lastElement().toString());
        stack.push(topMostElement);
    }

    public void add() {
        int sum = 0;
        Object[] stackArray = stack.toArray();

        for (int i = stackArray.length - 1; i >= stackArray.length - 2; i--) {
            sum = sum + Integer.parseInt(stackArray[i].toString());
            stack.pop();
        }
        // Integer add= Integer.parseInt(stack.get(stack.size()-1).toString() +
        // stack.get(stack.size()-2).toString());
        // stack.remove(1);
        // System.out.println(sum);
        stack.push(sum);
        // System.out.println(stack);

    }

    public void subtract() {

        Object[] stackArray = stack.toArray();
        int sum = Integer.parseInt(stackArray[stackArray.length - 1].toString());
        for (int i = stackArray.length - 2; i >= stackArray.length - 2; i--) {
            sum = sum - Integer.parseInt(stackArray[i].toString());
            stack.pop();
        }
        // Integer add= Integer.parseInt(stack.get(stack.size()-1).toString() +
        // stack.get(stack.size()-2).toString());
        // stack.remove(1);
        // System.out.println(sum);
        stack.push(sum);
        // System.out.println(stack);

    }

    public int solution(String S) {


        System.out.println(S.length());

        if(S.length() <= 0)
        {
            return -1;
        }


        try {

            String[] split = S.split(" ");



            for (int i = 0; i < split.length; i++) {
    
                String fString = String.valueOf(split[i]);
    
                // System.out.println(fString);
    
                if (fString.contains("DUP")) {
                    dup();
                }
    
                else if (fString.contains("+")) {
                    add();
                }
    
                else if (fString.contains("POP")) {
                    pop();
                }
    
                else if (fString.contains("-")) {
                    subtract();
                }
    
                if (fString.matches("[0-9]+") == true) {
                    stack.push(fString);
                }
    
                System.out.println(stack);
    
            }
            
        } catch (Exception e) {
                return -1;

        }
        int result = 0;
       
       

        result = Integer.parseInt(stack.lastElement().toString());

       
        // int result = 0;
        return result;

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s="5 5 5 5 5 5 5 5 5 5 5 5 488498494849849848449894849844 +";
        sol.solution(s);

    }
}