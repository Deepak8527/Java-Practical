import java.util.Scanner;
public class binarySearch {
    
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the number of elements: ");
  int n = scanner.nextInt();
  int[] array = new int[n];

  System.out.println("Enter " + n + " elements:");
  for (int i = 0; i < n; i++) {
   array[i] = scanner.nextInt();
  }

  System.out.print("Enter the element to search: ");
  int key = scanner.nextInt();

  int result = binarySearchArray(array, key);

  if (result == -1) {
   System.out.println("Element not found in the array");
  } else {
   System.out.println("Element found at index " + result);
  }
 }

 public static int binarySearchArray(int[] array, int key) {
  int left = 0;
  int right = array.length - 1;

  while (left <= right) {
   int mid = left + (right - left) / 2;

   if (array[mid] == key) {
    return mid;
   } else if (array[mid] < key) {
    left = mid + 1;
   } else {
    right = mid - 1;
   }
  }

  return -1;
 }
}



