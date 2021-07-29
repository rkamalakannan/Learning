import java.util.Arrays;
import java.util.HashMap;



public class MaxProfit {

    public int maxProfit(int[] prices) {

        int result = 0;
        int min = 0, max = 0;
        int minIndex = 0, maxIndex = 0 ;
        int[] copy = prices.clone();
        Arrays.sort(copy);
        min = copy[0];
        max = copy[copy.length-1];

        for (int i = 0; i < prices.length; i++) {

          if(min==prices[i])
          {
              minIndex = i;
               break;
          }

        }

        if(minIndex == prices.length - 1) return result = 0;

        for (int i = 0; i < prices.length - 1; i++) {

            if(max==prices[i])
            {
                maxIndex = i;
                 break;
            }
          }

        for (int i = minIndex; i < prices.length ; i++) {

            if(i>maxIndex) max = prices[i];
            
            if(prices[i] > max)
            {
                max = prices[i];

            }
                
        }

        result = max - min;

        return result;
    }



    public static void main(String[] args) {
        MaxProfit sol = new MaxProfit();
        int[] prices = { 2,4,1};
        sol.maxProfit(prices);
    }

}

