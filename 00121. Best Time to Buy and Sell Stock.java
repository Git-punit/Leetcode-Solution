class Solution {
    public int maxProfit(int[] prices) {
        int ls = Integer.MAX_VALUE;
        int op = 0;
        int pt = 0;

        for (int i = 0; i < prices.length; i++){
            if(prices[i] < ls){
                ls = prices[i];
            }
            pt = prices[i] - ls;
            if( op < pt){
                op = pt;
            }
        }
        return op;
    }
}
