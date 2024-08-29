public class _16ArrayDescending {
    public static void main(String[] args) {
        int arr[]={10, 7, 3, 15, 9};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] > arr[j]){
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
