public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int result[]=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                result[k++]=nums1[i++];
            }else{
                result[k++]=nums2[j++];
            }
        }
        while(i<m){
            result[k++]=nums1[i++];
        }
        while(j<n){
            result[k++]=nums2[j++];
        }
        if(result.length%2==0){
            return (double) (result[result.length/2] + result[result.length/2 -1])/2;
        }
        return (double) result[result.length/2];
    }
    public static void main(String[] args) {
        int nums1[]={1,3};
        int nums2[]={2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    
}
