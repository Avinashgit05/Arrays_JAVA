public class FirstAndLastPosition{
    public static int firstIndex(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int firstIndex=-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]==target){
              firstIndex=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
           
        }
         return firstIndex;
    }


    public static int lastIndex(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int lastIndex=-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]==target){
                lastIndex=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
           
        }
         return lastIndex;
    }


    public static int[] searchRange(int[] nums, int target) {
        int list[]={firstIndex(nums,target),lastIndex(nums,target)};
           return list;
    }
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target=8;
        int r[]=searchRange(nums,target);
        for(int i : r){
            System.out.println(i);
        }
    }
}