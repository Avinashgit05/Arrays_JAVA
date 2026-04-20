import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int temp[]=Arrays.copyOf(nums, nums.length);
        int result[]=new int[2];
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int index1=-1;
        int index2=-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
              index1=left;
              index2=right;
              break;
            }
            else if(sum>target) {
                right--;
            }
            else{
                left++;
            }
        }
        int firstindex=-1;
        int secondindex=-1;
        for(int i=0;i<temp.length;i++){
            if(firstindex==-1 && temp[i]==nums[index1]){
                firstindex=i;
            }
            else if(secondindex==-1 && temp[i]==nums[index2]){
                secondindex=i;
            }
        }
        result[0]=firstindex;
        result[1]=secondindex;
        return result;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,1,7,3,8};
        int target=11;
       
        int result[]=twoSum(arr,target);
         for(int i=0;i<2;i++){
            System.out.println(result[i]);
        }
    }
}
