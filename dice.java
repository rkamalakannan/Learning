public class dice {
    
    public static int[] solution(int[] A, int F, int M) {
        int sum = 0;  

        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];  

        }

        int sumCheck = sum+F;
        int check =sumcheck / A.length;

        System.out.println(sum);

        if(A.length<0)
        return A;
        // write your code in Java SE 8
    }

    public static void main(String[] args) {
      int[] a  = {3,2,4,3};
      int F= 2;
      int M = 4;    
    
      solution (a,F,M);    }
}
