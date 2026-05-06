import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        List<int[]> result= new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for( int [] interval : intervals){
            if(result.size()==0|| result.get(result.size()-1)[1]<interval[0]){
                result.add(interval);
            }
            else{
                result.get(result.size()-1)[1]=Math.max( result.get(result.size()-1)[1],interval[1]);
            }
        }
        return result.toArray(new int [result.size()][]);
    }
    public static void main(String[] args) {
       int intervals[][]={{1,3},{2,6},{8,10},{15,18}};
       int r[][]=merge(intervals);
       for(int[] interval : r){
        System.out.print("{"+interval[0]+","+interval[1]+"} ,");
       }
    }
}
