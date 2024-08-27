public class _13ArrayPresent25 {
    public static void main(String[] args) {
        int arr[]={5,10,15,20};
        int present=20;
        int index=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == present){
                index=i;
                break;

}
        }
        if(index != -1){
            System.out.println("present");
        }
else{
    System.out.println("not present");
    }

}
    }
    