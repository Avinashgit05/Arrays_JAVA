public class RunningSum1DArray {
public static int[] runningSum(int[] nums) {
        int runSum[]=new int[nums.length];
        runSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            runSum[i]=runSum[i-1]+nums[i];
        }
        return runSum;
    }
    public static void main(String[] args) {
        int nums[]={3,1,2,10,1};
        int result[]=runningSum(nums);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}