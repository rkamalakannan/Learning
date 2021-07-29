    
    import java.util.*;
    class Logger {

        /** Initialize your data structure here. */

        Stack stack =  new Stack();
        // int t = 10;
 
       /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
       If this method returns false, the message will not be printed.
       The timestamp is in seconds granularity. */


       // Step 1 - intialize stack
       //step 2 -  insert the first message to stack
       // step 3 - check timestamp < 10 , ,stack contains the message -- return true
       public boolean shouldPrintMessage(int timestamp, String message) {

        boolean isRepeated = false;

       
        stack.push(message);
    
        
        if(stack.contains(message)==true)
        {
            isRepeated = t
        }        
        return false;
       }
     }