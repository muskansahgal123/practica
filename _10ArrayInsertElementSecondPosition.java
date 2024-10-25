package _2ArrayPractica;

public class _10ArrayInsertElementSecondPosition {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8 };
        int arr2[] = new int[arr.length + 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 2) {
                arr2[count] = 9;
                count++;
            }
            arr2[count] = arr[i];
            count++;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

}
