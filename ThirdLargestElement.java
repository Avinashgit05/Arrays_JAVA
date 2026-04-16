public class ThirdLargestElement {
public static int thirdLargest(int arr[]) {
        if(arr.length==0){
            return -1;
        }
        int firstLargest =-1;
        int secondLargest =-1;
        int thirdLargest=-1;
        for(int i :arr){
            if(i>=firstLargest){
                thirdLargest=secondLargest;
                secondLargest=firstLargest;
                firstLargest=i;
            }
            else if(i>=secondLargest){
                thirdLargest=secondLargest;
                secondLargest=i;
                
            }
            else if(i>=thirdLargest){
                thirdLargest=i;
            }
        }
        return thirdLargest;
        
    }
    public static void main(String args[]){
        int arr[]={23,45,32,53,57,32};
       System.out.println( thirdLargest(arr));
    }
}