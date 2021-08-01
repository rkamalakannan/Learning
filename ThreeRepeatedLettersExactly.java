import java.util.Random;

public class ThreeRepeatedLettersExactly {

    public String functionRandom(int A, int B) {
        String randomString = "";
        Random random = new Random();
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < A + B; i++) {
            boolean randomBoolean = random.nextBoolean();
            if (randomBoolean != true) {
                randomString = randomString.concat("a");
                countA++;
            } else {
                randomString = randomString.concat("b");
                countB++;
            }
        }

        if ((countA == A && countB == B)) {
            return randomString;

        }

        return functionRandom(A, B);

    }

    public String solution(int A, int B) {

        String randomString = functionRandom(A, B);

        while (!randomString.contains("aaa") && !randomString.contains("bbb"))
            return randomString;

        return solution(A, B);
    }

    public static void main(String[] args) {
        ThreeRepeatedLettersExactly sol = new ThreeRepeatedLettersExactly();
        int A = 1;
        int B = 4;
        sol.solution(34, 34);
    }

}
