package _2ArrayPractica;

class Demoo{
    public static void main(String[] args) {
        int arr[]={5,6,7,8};
        int a=9;
        int arr1[]=new int[arr.length+1];
        for(int i=0; i<arr.length; i++){
            arr1[i]=arr[i];
        }
        arr1[arr.length]=a;
        arr = arr1;
        if(arr == arr1){
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }

        }
    }
}