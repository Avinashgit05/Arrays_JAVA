public class MaximumAverageSubarray1 {
     public static  double findMaxAverage(int[] nums, int k) {
        double max=Double.NEGATIVE_INFINITY;
        for(int i=0;i<=nums.length-k;i++){
            int sum=0;
            for(int j=i; j<i+k;j++){
                sum+=nums[j];
            }
            max=Math.max(max,(double)sum/k);
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
}
