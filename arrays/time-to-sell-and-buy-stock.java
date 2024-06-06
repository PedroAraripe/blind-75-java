class Solution {
  public int maxProfit(int[] prices) {
    int bestProfit = 0;

    if(prices.length < 2) {
      return bestProfit;
    }

    int bestBuy = prices[0];

    for(int i = 1; i < prices.length; i++) {
      int num = prices[i];
      int currentProfit = num - bestBuy;

      if(currentProfit > bestProfit) {
        bestProfit = currentProfit;
      }

      if(num < bestBuy) {
        bestBuy = num;
      }
    }

    return bestProfit;
  }
}