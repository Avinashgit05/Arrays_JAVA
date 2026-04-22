public class SortColor {
    public static void swap(int nums[],int i , int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    } 
    public static void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums, mid, high);
                high--;

            }
        }
         for(int i=0;i<nums.length;i++){
                System.out.println(nums[i]);
            }
    }
public static void main(String[] args) {
    int arr[]={0,0,1,1,2,2};
    sortColors(arr);
}
}
