public class _17ArrayMinNumber {
    public static void main(String[] args) {
        int arr[]={22, 33, 44, 11, 55};
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    
}
