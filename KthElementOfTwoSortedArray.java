public class KthElementOfTwoSortedArray {
     public static int kthElement(int a[], int b[], int k) {
          int m=a.length;
        int n=b.length;
        int result[]=new int[n+m];
        int i=0;
        int j=0;
        int l=0;
        // merge two array 
        while(i<m && j<n){
            if(a[i]<b[j]){
                result[l++]=a[i++];
            }else{
                result[l++]=b[j++];
            }
        }
        // if the element left in a then insert
        while(i<m){
            result[l++]=a[i++];
        }
        // if the element left in b then insert
        while(j<n){
            result[l++]=b[j++];
        }
        // k-1th element will be the kth element in newly formed array 
        return result[k-1];
    }
    public static void main(String args[]){
        int a[] = {2, 3, 6, 7, 9};
        int b[] = {1, 4, 8, 10};
        int k = 5;
        System.out.println(kthElement(a, b, k));
    }
}
