public class aximumSubArraySum {
    // public static int maxSubArray(int[] nums) {
    //     int max=nums[0];
    //     int currMax=nums[0];
    //     for(int i=1; i<nums.length;i++){
    //          currMax=Math.max(nums[i], currMax+nums[i]);
    //          max=Math.max(max,currMax);
    //     }
    //     return max;
    // }
    public static int maxSubArrayBruteForce(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        // System.out.println(maxSubArray( nums));
        System.out.println(maxSubArrayBruteForce(nums));
    }
    
}
