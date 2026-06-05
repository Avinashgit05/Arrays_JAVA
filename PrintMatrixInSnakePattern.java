import java.util.ArrayList;
import java.util.List;

public class PrintMatrixInSnakePattern {
    public static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int n=matrix.length;
        int left=0;
        int right=n-1;
        int top=0;
        while(top!=n){
            if(top%2==0){
                for(int i=0; i<=right;i++){
                    result.add(matrix[top][i]);
                }
                left=0;
                right=n-1;
                top++;
            }
            
            else{
                for(int i=right;i>=left;i--){
                    result.add(matrix[top][i]);
                }
                left=0;
                right=n-1;
                top++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int matrix[][]={{45, 48, 54},{21, 89, 87}, {70, 78, 15}};
         List<Integer> result=new ArrayList<>();
         result=snakePattern(matrix);
        for(int ele : result){
                System.out.print(ele+" ");
        }
    }
    
}
