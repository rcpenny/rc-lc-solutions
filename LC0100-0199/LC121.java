// Best Time to Buy and Sell Stock

@EASY
@Microsoft
class LC121 {

  @DynamicProgramming
  public int maxProfit(int[] prices) {
    if (prices == null || prices.length <= 1) {
      return 0;
    }

    int profit = 0;
    int min = prices[0];

    for (int i = 0; i < prices.length; i++) {
      profit = Math.max(profit, prices[i] - min);
      min = Math.min(min, prices[i]);
    }

    return profit;
  }
}