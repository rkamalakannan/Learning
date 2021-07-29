import java.util.Stack;

public class HammingWeight{


    public int hammingWeight(int n) {

        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toUnsignedString(n));
        System.out.println(Integer.toBinaryString(n) );
        int two= Integer.parseInt(Integer.toBinaryString(n))+1;

        int bitCount = n << n;
      int binary = Integer.parseInt(Integer.toBinaryString(n) );  
      int reverseInt = Integer.reverse(binary);
        Stack stack = new Stack();

        
      

        

        // System.out.println(reverse);
        
        return n;
        

    }

    public static void main(String[] args) {
        HammingWeight weight = new HammingWeight();
        int value = 000000101;
        weight.hammingWeight(123);
    }
}