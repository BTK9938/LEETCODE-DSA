class Solution {
    public int maxProfit(int[] prices) {
        int minp=prices[0],maxp=0,profit;
        for(int i=1;i<=prices.length-1;i++){
            profit=prices[i]-minp;
            maxp=Math.max(maxp,profit);
            minp=Math.min(prices[i],minp);
            
            }

        
        
    
    return maxp;}
}