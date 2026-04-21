public class TwoSum2 {
     public static int[] twoSum(int[] numbers, int target) {
        int r[]=new int[2];
        int left=0;
        int right=numbers.length -1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
             r[0]=left+1;
             r[1]=right+1;
            break;
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int r[]=twoSum(arr,target);
        for(int i=0;i<2;i++){
        System.out.println(r[i]);
        }
    }
    
}
