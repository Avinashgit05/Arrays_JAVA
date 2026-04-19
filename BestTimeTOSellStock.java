public class BestTimeTOSellStock {
    public static int maxProfit(int[] prices) {
        // int maxProfit=0;
        // for(int i =0; i<prices.length;i++){
        //     for(int j=i;j<prices.length;j++){
        //         if(prices[j]>prices[i]){
        //             int profit=prices[j]-prices[i];
        //             maxProfit=Math.max(maxProfit,profit);
        //         }
        //     }
        // }
        // return maxProfit;

        //Optimized code.

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
