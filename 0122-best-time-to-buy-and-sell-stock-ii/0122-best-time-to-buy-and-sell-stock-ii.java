class Solution {
    public int maxProfit(int[] prices) {
         int hold =Integer.MIN_VALUE;
        int sell=0;
        for(int price: prices)
        {                   
            sell=Math.max(sell,hold+price);
            hold=Math.max(hold,sell-price);
        }
        return sell;
        
        
    }
}