import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.ForkJoinPool;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())

            return false;

        Stack sStack = new Stack<>();
        Stack tStack = new Stack<>();

        sStack.push(s.charAt(0));
        tStack.push(t.charAt(0));
        for (int i = 0; i < s.length() || i < t.length(); i++) {

            System.out.println(tStack.search(t.charAt(i)));

            if (tStack.search(t.charAt(i)) == -1){
                sStack.push(s.charAt(i));
                tStack.push(t.charAt(i));
            }

        }

        System.out.println(sStack);
        System.out.println(tStack);
        // for (int i = 0; i < t.length(); i++) {

        // tStack.push(t.charAt(i));
        // }

        System.out.println(s.replace(sStack.get(0).toString(), tStack.get(0).toString()));
    
        String replace = "";
        replace = s.replace(sStack.get(0).toString(), tStack.get(0).toString());
       replace =  s.replace(sStack.get(1).toString(), tStack.get(1).toString());
        System.out.println(replace);
        return false;

    }

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        isomorphicStrings.isIsomorphic("bbbaaaba", "aaabbbba");
    }

}
