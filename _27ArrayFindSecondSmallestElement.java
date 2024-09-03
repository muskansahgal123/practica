package _2ArrayPractica;
//27. Find the second smallest element in the array [3, 1, 4, 1, 5, 9].
class Smallest{
        public static void main(String[] args) {
            int arr[]={3,1,4,1,5,9};
        for (int i = 0; i < arr.length - 1; i++) {
        for (int j = i+1; j < arr.length ; j++) {
        if (arr[i] > arr[j]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
        }
        }
        System.out.println(arr[2]);
        }
        }
        