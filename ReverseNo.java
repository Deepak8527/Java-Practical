import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to reverse number method\n");
        System.out.println("Enter your number : ");
        number = sc.nextInt();
        int reverse = 0, remainder;
        while(number!=0)
        {
            remainder = number%10;
            reverse = reverse*10+remainder;
            number = number/10;
        }
        System.out.println("The reverse number is : " +reverse);

    }
}
