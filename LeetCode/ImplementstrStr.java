public class ImplementstrStr {
    public int strStr(String haystack, String needle) {

        int index = -1;
        if(haystack.contains(needle))
        {
            index = haystack.indexOf(needle);
        }
        
        if(needle.isBlank()) index = 0;
        return index;
        
    }

    public static void main(String[] args) {
        ImplementstrStr sol = new ImplementstrStr();
        sol.strStr("hello", "ll");
    }
    
}
