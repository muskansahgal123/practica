public class _15ArrayAsendingOrder {
    public static void main(String[] args) {
        int arr[]={5, 3, 8, 1, 2};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
