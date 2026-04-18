public class BestTimeTOSellStock {
    public static int maxProfit(int[] prices) {
        int lowestPrice=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<lowestPrice){
                lowestPrice=prices[i];
            }
            int profit=prices[i]-lowestPrice;
            maxProfit =Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));   
     }
}
