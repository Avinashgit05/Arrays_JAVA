public class TransposeMatrix {
 public static int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int result[][]= new int[m][n];
        int i=0;
        int j=0;
        for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            
            result[j][i]=matrix[i][j];
        }
        }
        return result;
    }
    public static void main(String args[]){
        int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int result[][]=transpose(matrix);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
