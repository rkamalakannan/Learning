public class CountingBits {
    

    public int[] countBits(int n) {

        System.out.println(Integer.bitCount(2));

        int[] A = new int[n+1];
        if(n==0)
        {
             return A;
        }
        for (int i = 0; i < A.length; i++) {

            A[i] = Integer.bitCount(i);
            
        }
        System.out.println(Integer.bitCount(2));
        return A;




            

        
    }

    public static void main(String[] args) {
        
        CountingBits countingBits = new CountingBits();
        countingBits.countBits(2);
    }


    
}
