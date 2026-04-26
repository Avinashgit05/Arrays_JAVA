public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
         int left=0;
        int right=height.length-1;
        //int currArea=0;
        int maxArea=0;
//         while(left<right)
// {
//     if(height[left]<=height[right]){
//         currArea=(right-left)*height[left];
//         left++;
//     }
//     else{
//         currArea=(right-left)*height[right];
//         right--;

//     }
//     maxArea=Math.max(currArea,maxArea);
// }
//         return maxArea;

        while(left<right){
            int h=Math.min(height[left],height[right]);
            int w =right-left;
           int currArea=h*w;
            maxArea=Math.max(maxArea,currArea);
            if(height[left]<height[right]) {
                left++;
            }
            else{

            right--;
            }

        }
        return maxArea;
    }
    public static void main(String[] args) {
        int height[]= {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    
}
