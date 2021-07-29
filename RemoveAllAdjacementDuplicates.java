import java.util.*;
import java.util.concurrent.ForkJoinPool;

public class RemoveAllAdjacementDuplicates {

    public String removeDuplicates(String s, int k) {

        HashMap<Integer, Character> vMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            vMap.put(i, s.charAt(i));
        }

        for (int i = 0; i < vMap.size(); i++) {

        for (Object j : vMap.keySet()) {

            System.out.println(j);
                if(vMap.get(j).equals(s.charAt(i)))
                {
                    count++;
                }

            }
            
        }

            if (count == k) {
                System.out.println("k times repeated!");
            }

            System.out.println(vMap);
            return s;
        }





    public static void main(String[] args) {
        RemoveAllAdjacementDuplicates duplicates = new RemoveAllAdjacementDuplicates();
        duplicates.removeDuplicates("deeedbbcccbdaa", 3);
    }

}
