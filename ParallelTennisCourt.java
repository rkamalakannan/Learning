import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

public class ParallelTennisCourt {

    public int solution(int P, int C) {
        HashMap<String,Integer> vMap = new HashMap<>(2);
        int gameCount = 0;
        int playerCount = 0;
        for (int i = 1; i < P; i++) {
            gameCount = i;
        }
        if(gameCount > C )
        {
            gameCount = (C*2) - ;
        }


        
        return gameCount;
        // write your code in Java SE 11

        

        
    }
    
    public static void main(String[] args) {
        ParallelTennisCourt parallelTennisCourt = new ParallelTennisCourt();
        parallelTennisCourt.solution(5,3);
    }
}
