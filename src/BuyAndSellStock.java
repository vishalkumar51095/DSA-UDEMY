
public class BuyAndSellStock {
	public static void main(String[] args) {
		int prices [] = {231,123,345,567,212,245,345,543,321,234};
		int maxProfit= maxProfit(prices);
		System.out.println("Maximum Profit:"+ maxProfit);
	}
	public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
 
        for (int price : prices) {
            if (price < minPrice) {
            	
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
 
        return maxProfit;
    }
}
