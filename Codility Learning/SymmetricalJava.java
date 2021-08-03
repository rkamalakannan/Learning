public class SymmetricalJava {

    public int solution(String S) {

        int median = S.length() / 2;

        if (S.isEmpty())
            return -1;

        StringBuilder stringBuilderLeft = new StringBuilder();

        String left = S.substring(0, median);
        String right = S.substring(median + 1, S.length());
        if (left.isEmpty() == true && right.isEmpty() == true)
            return 0;
        String reverseLeft = stringBuilderLeft.append(left).reverse().toString();
        if (reverseLeft.equals(right) && !reverseLeft.isEmpty() && !reverseLeft.isEmpty()) {
            return median;
        }

        else {
            return -1; // write yoaur code in Java SE 8
        }
    }

    public static void main(String[] args) {
        SymmetricalJava sol = new SymmetricalJava();
        sol.solution("x");
    }
}
