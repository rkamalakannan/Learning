public class MinimumFrogJump {

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int count = 0;
        int result = 0;
        int sum = X;
        

        if ((Y - X) % D == 0) {
            return (Y - X) / D;
        }
        return((Y - X) / D )+ 1;
       }

    public static void main(String[] args) {
        MinimumFrogJump sol = new MinimumFrogJump();
        sol.solution(2, 8, 7);
    }

}
