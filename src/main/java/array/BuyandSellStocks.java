package array;

public class BuyandSellStocks {

  public static void main(String[] args) {
    new BuyandSellStocks().maxProfit(new int[]{7, 1, 5, 4, 3});
  }

  public int maxProfit(int[] prices) {
    int max_profit = 0;
    {
      for (int i = 0; i < prices.length; i++) {
        for (int j = i + 1; j < prices.length; j++) {

          int profit = prices[j] - prices[i];
          if (max_profit < profit) {
            max_profit = profit;
          }
        }


      }


    }

    return max_profit;
  }


}


