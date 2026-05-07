import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static int[] sortArray(int[] nums) {

        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public static void mergeSort(int nums[],int low,int high){
        if(low>=high){
            return ;
        }
        int mid = (low+high)/2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);
        merge(nums , low , mid , high);
     }

     public static void merge(int nums[],int low, int mid , int high){
        List<Integer> result= new ArrayList<>();
        int left= low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                result.add(nums[left]);
                left++;
            }
            else{
                result.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
              result.add(nums[left]);
                left++;
        }
         while(right<=high){
              result.add(nums[right]);
                right++;
        }
        for(int i=low; i<=high;i++){
            nums[i]=result.get(i-low);
        }

     }
     public static void main(String[] args) {
        int nums[]={5,2,3,1};
        int r[]=sortArray(nums);
        for(int num : r){
            System.out.print(num+",");
        }
     }
}
