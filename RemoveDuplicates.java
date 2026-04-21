public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int writer =0;
        for(int reader=1; reader<nums.length;reader++){
           if(nums[writer]!=nums[reader]){
                writer++;
                nums[writer]=nums[reader];
           }
        }
        return writer+1;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    
}
