public class _20ArrayavarageElement {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        int sum=0;
        double avg;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
     avg=(double) sum/arr.length;
     System.out.println(avg);
    }
    
}
