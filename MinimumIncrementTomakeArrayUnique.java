import java.util.Arrays;

public class MinimumIncrementTomakeArrayUnique {
    public static int minIncrementForUnique(int[] nums) {
        int minInc=0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                int inc=nums[i-1]+1-nums[i];
                nums[i]=nums[i-1]+1;
                minInc+=inc;
            }
        }
        return minInc;
    }
    public static void main(String[] args) {
        int nums[]={3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(nums));
    }
}
