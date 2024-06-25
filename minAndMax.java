import java.util.Scanner;

public class minAndMax {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many enter the element of number?");
        int n = sc.nextInt();
        System.out.print("Enter the element : " +n);
        
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();  
        }
        System.out.println("--------------------");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        int max = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.println("max is : " +max);
        System.out.println("----------------------------");
        int min = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        System.out.println("min is : " +min);
    }
}
