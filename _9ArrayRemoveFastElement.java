package _2ArrayPractica;

public class _9ArrayRemoveFastElement {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8};
        int arr2[]=new int[arr.length-1];
        for(int i=1; i<arr.length; i++){
            arr2[i-1]=arr[i];
        }
        arr = arr2;
        if(arr == arr2){
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }
    
}
