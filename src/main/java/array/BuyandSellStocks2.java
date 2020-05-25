package array;

public class BuyandSellStocks2 {

    public int m_Profit(int[] prices) {
        int i, profit = 0;
        for (i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }

        System.out.println(" maximum profit is " + profit + ".");

        return profit;
    }


    public static void main(String[] args) {
        new BuyandSellStocks2().m_Profit(new int[]{7,1,2,3,4,5});
    }

}






