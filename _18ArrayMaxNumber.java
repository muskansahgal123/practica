public class _18ArrayMaxNumber {
    public static void main(String[] args) {
        int arr[]={9, 8, 7, 10, 5};
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println(max);
        
    }
    
}
