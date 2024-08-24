public class _11ArraySecondPositionElementRemove {
    public static void main(String[] args) {
        int arr[]={18,19,20,21};
        int n=1;
        int arr2[]=new int[arr.length-1];
        for(int i=0,j=0; i<arr.length; i++){
            if(i != n){
                arr2[j++]=arr[i];
            }
        }
        arr = arr2;
            if(arr == arr2){
                for(int j=0; j<arr.length; j++){
                    System.out.println(arr[j]);
                }
            
            }
        }
    }
    

