class Solution {
    public int[] plusOne(int[] digits) {
        
       
        // int lastDigit = digits[digits.length-1];

        // int plusOneDigit = lastDigit+1;

        // digits[digits.length-1] = plusOneDigit;

        // return digits; 

        // [9,9] = [1,0,0]

        for (int i = digits.length-1; i > -1; i--) {

                if(digits[i]<9)
                {
                    digits[i] = digits[i] +1 ; 
                    return digits;
                }        

        }

        int[] newdigit= new int[]{digits.length+1};


        



        return digits;

        
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] digits = { 1,2,9 };
        sol.plusOne(digits);
    }
}