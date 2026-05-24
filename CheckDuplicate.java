import java.util.HashMap;

public class CheckDuplicate {
    public static boolean isDistinct(int[] arr) {
        HashMap<Integer, Boolean> map=new HashMap<>();
        for(int val : arr){
            if( map.get(val)==null){
                map.put(val,true);
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int nums[]={1, 2, 3, 4, 7};
        System.out.println(isDistinct(nums));
    }
}
