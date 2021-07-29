import java.util.*;

public class TestAlto {

    public static int solution(String[] A) {

        String test="";
        List<String> stringlist = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            
            test = test.concat(A[A.length-1]).concat(A[i]);

            stringlist.add(test);

            test = "";
            // for (int j = i+1; j < A.length; j++) {

            //     test = test.concat(A[j]);
                
            // }

        }
        

       
        System.out.println(test);
        return 0;
        // write your code in Java SE 11
    }
    public static void main(String[] args) {

        String[] A ={"co","dil","ity"};
        solution(A);
        
    }
    
}
