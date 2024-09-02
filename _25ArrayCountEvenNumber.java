package _2ArrayPractica;

public class _25ArrayCountEvenNumber {
    public static void main(String[] args) {
        int arr[]={13, 14, 15, 16, 17, 18};
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                count++;
            }
        }
        System.out.println(count);

    }
    
}
