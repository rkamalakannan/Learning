public class CountPrimes {
    public int countPrimes(int n) {

        int primeNumber = 0;

        for (int i = 2; i < n; i++) {

            if(n%i!=0)
            {
                primeNumber++;
            }

            
        }
        return n;
        
        
        
    }

    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        countPrimes.countPrimes(10);
    }
    
}
