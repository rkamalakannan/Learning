import java.util.HashMap;

import java.util.*;

public class ValidParanthesis {

    // '(',''')','{​​​','}​​​','['and']'
    //initalize stack 

    // initalize hashmap ')' ,'(';

//     String s = "({})";  // valid
//     HashMap<Character,Character> vMap= new HashMap<>();
    
//  //initalize 
//     vMap.put(')','('));

public boolean isValid(String s) {​​​

    String s = "({}){";
    Stack stack = new Stack();

    HashMap<Character,Character> vMap = new HashMap<>();
    vMap.put('}', '{');
    vMap.put(')', '(');
 



    for (int i = 0; i < s.length(); i++) {

        stack.push(s.charAt(i));

        if(stack.lastElement()==vMap.get(s.charAt(i))) {// (
            stack.pop(); 
            //delete element
        }

        
    }

    

        


        
        if(stack.isEmpty()==true)
        {
            return isValid = false;
        }
        
        return true;
    }

    return true;

}​​​
