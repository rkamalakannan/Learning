public class MinimumFrogJump {

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int count = 0;
        int result = 0;
        int sum = 0;

        while (sum < Y) {
            sum = sum + D;
            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        MinimumFrogJump sol = new MinimumFrogJump();
        sol.solution(3555555, 399999999, 30);
    }

}
