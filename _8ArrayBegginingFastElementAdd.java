package _2ArrayPractica;

public class _8ArrayBegginingFastElementAdd {
    public static void main(String[] args) {
        int arr[]={3,4,5,6};
        int n=2;
        int arr2[]=new int[arr.length+1];
        arr2[0]=n;
        for(int i=0; i<arr.length; i++){
            arr2[i+1]=arr[i];
        }
        arr = arr2;
        if(arr == arr2){
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }
    
}
