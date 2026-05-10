public class InsertionSort {
    public static void insertionSort(int [] nums){
        for(int i=0;i<nums.length;i++){
            int key =nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j=j-1;
            }
            nums[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int [] nums={10,50,30,20,40,70};
        insertionSort(nums);
        for(int num : nums){
            System.out.print(num+" ");
        }
    }
    
}
