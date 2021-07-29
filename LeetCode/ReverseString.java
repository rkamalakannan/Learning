import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.ForkJoinPool;

public class ReverseString {
    public void reverseString(char[] s) {

        System.out.println(s);
        HashMap<Integer,Character> vMap = new HashMap<Integer,Character>();
        int increment=0;
        for (int i = s.length-1; i >=0; i--) {
            vMap.put(increment, s[i]);
            increment++;
            
        }
        for (int i = 0; i < vMap.size(); i++) {
            s[i]=vMap.get(i);
            
        }
        System.out.println(s);
        

        

    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char s[] = {'h','e','l','l','o'};
        reverseString.reverseString(s);
        
    }


    
}
