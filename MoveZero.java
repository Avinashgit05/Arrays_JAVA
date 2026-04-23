public class MoveZero {
    public static void moveZeroes(int[] nums) {
        int writer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[writer]=nums[i];
                writer++;
            }
        }
        for(int j=writer;j<nums.length;j++){
            nums[j]=0;
        }
        for(int k=0;k<nums.length;k++){
            System.out.println(nums[k]);
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        moveZeroes(arr);
    }
    
}
