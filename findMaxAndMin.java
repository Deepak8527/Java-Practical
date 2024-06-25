import java.util.Scanner;

public class findMaxAndMin {
    public static void main(String[] args) {
        int num1 , num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to find maximum and minimum number\n");
        System.out.println("Enter the first and second number  : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int max = 0;
        int min = 0;
        if(num1>num2)
        {
            max = num1;
            min = num2;
            System.out.println("max is : " + max);
            System.out.println("min is : " + min);
        }
        else{
            max = num2;
            min = num1;
            System.out.println("max is : " + max);
            System.out.println("min is : " + min);
        }
    }
}
