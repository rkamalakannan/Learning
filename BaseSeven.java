import java.util.HashMap;

public class BaseSeven {
    public String convertToBase7(int num) {

      String result =   Integer.toString(num, 7);

               return result;
        
        
    }

    public static void main(String[] args) {
        BaseSeven obj = new BaseSeven();
        obj.convertToBase7(100);
    }
    
}
