public class SetMatrixZero {
    public static int[][] setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean row[]=new boolean[n];
        boolean col[]=new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
        int result[][]=setZeroes(matrix);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
