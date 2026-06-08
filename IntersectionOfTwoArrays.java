import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result= new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            if(set.contains(num)){
            result.add(num);
            }
        }
        int [] res =new int[result.size()];
        int i=0;
        for( int num : result){
            res[i++]=num;
        }
        return res;
    }
    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        int result[]=intersection(nums1, nums2);
        for(int num : result){
            System.out.print("["+num+",");
        }
        System.out.println("]");
    }
}
