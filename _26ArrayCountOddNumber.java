package _2ArrayPractica;
//26. Count the number of odd numbers in the array [19, 20, 21, 22, 23, 24].

public class _26ArrayCountOddNumber {
    public static void main(String[] args) {
        int arr[]={19,20,21,22,23,24};
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                count++;
            }
        }
        System.out.println(count);

    }
    
}
