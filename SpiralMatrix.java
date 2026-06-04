import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int n= matrix.length;
        int m =matrix[0].length;
        int left =0;
        int right=m-1;
        int top=0;
        int bottom= n-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> result=new ArrayList<>();
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
         result=spiralOrder(matrix);
        for(int ele : result){
                System.out.print(ele+" ");
        }
        
    }
}
