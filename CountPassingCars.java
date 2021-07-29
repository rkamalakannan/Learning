import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountPassingCars {

    public int solution(int[] A) {

        int count = 0;


    
        for (int i = 0; i < A.length; i++) {

            if(i+1<A.length){
            

                if(A[i]!=A[i+1] && A[i]!=1)
                {
                    count = count + 1 ;
                }

            }
            
                

        
        }

        


           

            
        

       

        return 0;
        // write your code in Java SE 11

    }

    public static void main(String[] args) {
        CountPassingCars countPassingCars = new CountPassingCars();
        int[] A = { 0, 1, 0, 1, 1 };
        countPassingCars.solution(A);

    }
}
