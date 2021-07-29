class Palindrome
{
    public boolean isPalindrome(int x) {


        String converString = String.valueOf(x);

        String reverse = "";
        for (int i = converString.length()-1; i > -1 ; i--) {

            reverse = reverse.concat(String.valueOf(converString.charAt(i)));
          
        }

        if(converString.equals(reverse))
            return true;
        
        
        return false;
    
    }

    public static void main(String[] args) {
        Palindrome palindrome= new Palindrome();
        palindrome.isPalindrome(10);
    }
}