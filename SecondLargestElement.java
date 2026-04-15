public class SecondLargestElement{
    public static int secondLargestElement(int arr[]){
        int firstLargest=-1;
        int secLargest=-1;
        for(int i : arr){
            if(i>firstLargest){
                secLargest=firstLargest;
                firstLargest=i;
            }
            else if(i>secLargest && i!=firstLargest){
                secLargest=i;
            }
        }
         return secLargest;
    }
    public static void main(String[] args) {
        int arr[] = {23,64,83,90,75};
       System.out.println( secondLargestElement(arr));
    }
}