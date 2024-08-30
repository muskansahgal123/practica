package _2ArrayPractica;

public class _21ArrayCheckAsendingOrder {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        boolean index=true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                index=false;
            }
        }
        if(index){
            System.out.println("this is a accending array");
        }

        else{
            System.out.println("Not accending");
        }

    }
}
