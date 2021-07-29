import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character,Integer> hashMap = new HashMap<>();

        
        for (int i = 0; i < s.length(); i++) {

            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);

        }

        System.out.println(hashMap);

        for (int i = 0; i < s.length(); i++) {
            
            if(hashMap.get(s.charAt(i)) ==1)
            {
                return i;
            }
            
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.firstUniqChar("loveleetcode");
    }
}