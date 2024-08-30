package _2ArrayPractica;

public class _22ArrayCheckDescendingOrder {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        boolean index=true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                index=false;
                break;
            }
        }
        if(index){
            System.out.println("This is a descending array");
        }
        else{
            System.out.println("Not descending");
        }
    }
    
}
