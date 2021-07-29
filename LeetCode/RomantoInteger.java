import java.util.HashMap;

public class RomantoInteger{

    public int romanToInt(String s) {

        int sum=0;
        HashMap<String,Integer> vMap = new HashMap<>();
        vMap.put("I", 1);
        vMap.put("V", 5);
        vMap.put("X", 10);

        vMap.put("L", 50);

        vMap.put("C", 100);

        vMap.put("D", 500);

        vMap.put("M", 1000);

        vMap.put("IV", s.contains("IV")==true? 4 : 0);

        vMap.put("IX", s.contains("IX")==true? 9 : 0);

        vMap.put("XL", s.contains("XL")==true? 40 : 0);

        vMap.put("XC", s.contains("XC")==true? 90 : 0);

        vMap.put("CD", s.contains("CD")==true? 400 : 0);

        vMap.put("CM", s.contains("CM")==true? 900 : 0);



       int specialSum = sum+vMap.get("IV")+vMap.get("IX")+vMap.get("XL")+vMap.get("XC")+vMap.get("CD")+vMap.get("CM");

        for (int i = 0; i < s.length(); i++) {

            if (vMap.containsKey(s.charAt(i))==true)
            {
                 int romanValue= vMap.get(s.charAt(i));
            }
                        


            // sum=sum+romanValue-specialSum;
            
         
        }
        return sum;
        
    }

    public static void main(String[] args) {
        String s ="LVIII";
        RomantoInteger romantoInteger = new RomantoInteger();
        romantoInteger.romanToInt(s);
    }
}