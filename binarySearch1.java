import java.util.Scanner;

public class binarySearch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element of array : ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to search : ");
        int key = scanner.nextInt();
        int result = biSearchArr(arr, key);
        if (result == -1) 
           {
            System.out.println("Element not found in the array");
           } else 
           {
            System.out.println("Element found at index " + result);
           }
         
    }
    public static int biSearchArr(int arr[], int key)
    {
        int li = 0;
        int hi = arr.length-1;
        int mi = (li+hi)/2;
        while(li<=hi)
        {
            if(arr[mi]==key)
            {
                return mi;
            }
            else if(arr[mi]<key)
            {
                li = mi +1;
            }
            else
            {
                hi = mi - 1;
            }
            mi = (li+hi)/2;
        }
        return -1;
    }
}
