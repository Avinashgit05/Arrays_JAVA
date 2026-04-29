public class MajorityElements {
    public static int majorityElement(int[] nums) {
        // int n=nums.length;
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }
        //     else{
        //         map.put(nums[i],1);
        //     }
        //     if(map.get(nums[i])>n/2){
        //         return nums[i];
        //     }
        // }
        // return 0;
        int candidate=0;
        int count=0;
        for(int num : nums){
            if(count==0) candidate=num;
            count+=(candidate==num)?1:-1;
        }
    return candidate;
    }
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    
}
