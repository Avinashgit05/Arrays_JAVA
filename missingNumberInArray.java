public class missingNumberInArray {
    public static int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        int flagArr[]= new int[n+2];
        for(int ele : arr){
            flagArr[ele]=1;
        }
        for(int i=1;i<flagArr.length;i++){
            if(flagArr[i]==0){
                return i;
            }
        }
        return 0;

        // Method2

        // int n=arr.length;
        // int sum=(n+1)*(n+2)/2;
        // for(int ele :arr){
        //     sum-=ele;
        // }
        // return sum;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 5};
        System.out.println(missingNum( arr));

    }
}
