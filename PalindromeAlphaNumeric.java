public class PalindromeAlphaNumeric {

    public boolean isPalindrome(String s) {

        s = s.replaceAll(" ", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        String reverse = "";

        for (int i = s.length() - 1; i > -1; i--) {

            reverse = reverse.concat(String.valueOf(s.charAt(i)));

        }

        if (reverse.equals(s))
            return true;

        return false;

    }

    public static void main(String[] args) {
        PalindromeAlphaNumeric aPalindromeAlphaNumeric = new PalindromeAlphaNumeric();
        aPalindromeAlphaNumeric.isPalindrome("A man, a plan, a canal: Panama");
    }

}
