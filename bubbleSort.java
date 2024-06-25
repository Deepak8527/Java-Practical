import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        int arr[] = new int[size];
        System.out.println("enter the 10 element ");
        for(int i=0;i<size;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
         // Perform Bubble Sort
         bubbleSortArray(arr);

         // Print sorted array
         System.out.println("Sorted array:");
         for (int num : arr) {
             System.out.print(num + " ");
         }
 
         scanner.close();
     }
 
     // Bubble Sort function
     public static void bubbleSortArray(int[] arr) {
         int n = arr.length;
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                 if (arr[j] > arr[j + 1]) {
                     // Swap arr[j] and arr[j+1]
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                 }
             }
         } 
    }
}
