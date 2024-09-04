package _2ArrayPractica;
//Find the mode of the array [2, 3, 2, 5, 2, 6, 2].

public class _30ArrayModeNumberFind {
    public static void main(String[] args) {
    
    int arr[]={2,3,2,5,2,6,2};
    int maxcount=0;
    int maxvalue=0;
    
    for(int i=0; i<arr.length; i++){
        int count=0;

        for(int j=0; j<arr.length; j++){
        

            if(arr[i] == arr[j]){
            count++;

        }
    }
        if(count > maxcount){
            maxcount=count;
            maxvalue=arr[i];
        }
    }
    System.out.println(maxvalue);


    }  
}
