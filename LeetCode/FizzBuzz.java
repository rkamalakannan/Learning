import java.util.*;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {

        List<String> fizzBuzzList = new ArrayList<>();
        
        String[] answer= new String[n+1];

        for (int i = 1; i <=n; i++) {

            if(i%3==0 && i%5==0)
            {
                answer[i]="FizzBuzz";
                fizzBuzzList.add(answer[i]);

            }
            else if(i%3==0)
            {
                answer[i]="Fizz";
                fizzBuzzList.add(answer[i]);

            }
            else if(i%5==0)
            {
                answer[i]="Buzz";
                fizzBuzzList.add(answer[i]);


            }
            else
            {
                answer[i]=Integer.toString(i);
                fizzBuzzList.add(answer[i]);

            }
            
        }

        
       
        return fizzBuzzList;

    
        
    }

    public static void main(String[] args) {
        FizzBuzz buzz = new FizzBuzz();
        buzz.fizzBuzz(5);
    }
}
