public class BubbleSort {
    public static void  bubbleSort(int [] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j+1]<nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int nums[]={10,50,30,20,40,70};
        bubbleSort(nums);
        for(int num : nums){
            System.out.print(num+" ");
        }
    }
    
}
