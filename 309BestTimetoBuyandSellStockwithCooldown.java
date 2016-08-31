public int maxProfit(int[] prices) {
    int prevSell = 0, prevRest = 0, prevBuy = Integer.MIN_VALUE;
    for(int i = 0; i < prices.length; i++) {
        int newBuy = Math.max(prevBuy, prevRest-prices[i]);

        prevRest = Math.max(prevSell, prevRest);
        prevSell = prevBuy+prices[i];
        prevBuy = newBuy;
    }
    
    return Math.max(prevRest, prevSell);
}