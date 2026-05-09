public class SelectionSort {
    public static void SelectionSort(int []nums){
       
        for(int i=0; i<nums.length;i++){
             int min=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min] ){
                    min=j;
                }
            }
                int temp=nums[i];
                nums[i]=nums[min];
                nums[min]=temp;
            }
        }
    public static void main(String[] args) {
        int nums[]={10,50,30,20,70};
         SelectionSort(nums);
         for(int num : nums){
            System.out.print(num+" ");
         }

    }
    
}
