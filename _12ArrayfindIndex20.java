public class _12ArrayfindIndex20 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int find=20;
        int index=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == find){
                index=i;
                break;
            }
        }
        if(index != -1){
            System.out.println("this is a find element  "+find+"and index position"+" "+index);
        }
        else
    {
        System.out.println("Not found 20");
    }
    }
    
}
