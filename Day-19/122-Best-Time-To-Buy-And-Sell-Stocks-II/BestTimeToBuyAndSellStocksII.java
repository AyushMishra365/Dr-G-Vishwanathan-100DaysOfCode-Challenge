public class BestTimeToBuyAndSellStocksII {
    public static void main(String[] args) {
        int[] prices= new int[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        System.out.println(profit);
    }
}
