package _2ArrayPractica;
//Find the second largest element in the array [6, 7, 8, 9, 10]
public class _28ArraySecondLargest {
    public static void main(String[] args) {
        int arr[]={6,7,8,9,10};
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(arr[1]);
    }

    
}
