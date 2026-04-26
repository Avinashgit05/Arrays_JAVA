public class TrappingRainWater {
     public static int trap(int[] height) {
        int n=height.length-1;
        // int[] leftMax=new int[n];
        // int[] rightMax=new int[n];
        // leftMax[0]=height[0];
        // rightMax[n-1]=height[n-1];
        // for(int i=1;i<n;i++){
        //     leftMax[i]=Math.max(leftMax[i-1],height[i]);
        // }
        // for(int j=n-2;j>=0;j--){
        //     rightMax[j]=Math.max(rightMax[j+1],height[j]);
        // }
        // int water=0;
        // for(int k=0;k<n;k++){
        //     water=water+(Math.min(leftMax[k],rightMax[k])-height[k]);

        // }
        // return water;
        int leftMax=0;
        int rightMax=0;
        int trapWater=0;
        int left=0;
        int right=n;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftMax){
                   leftMax=height[left];
                }
                else{
                    trapWater+=leftMax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightMax){
                    rightMax=height[right];
                }
               
                else{
                    trapWater+=rightMax-height[right];
                }
                 right--; 
               
            }
           
        }
         return trapWater;

    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
    
