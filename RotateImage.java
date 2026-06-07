public class RotateImage {
    public static int[][] rotate(int[][] matrix) {
        int n= matrix.length;
        // step-1 take transpose.
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
//step2-reverse the each row to rotate.
        for(int i=0;i<n;i++){
            int left =0;
            int right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
        return matrix;
    }
    public static void main(String arga[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int result[][]=rotate(matrix);
        for(int row[] : result){
            for(int ele: row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
