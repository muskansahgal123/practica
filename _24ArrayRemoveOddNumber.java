package _2ArrayPractica;

class Odd{
    public static void main(String[] args) {
        int arr[]={7, 8, 9, 10, 11, 12};
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.println("This ia a even number"+arr[i]);
            }
        }
    }
}