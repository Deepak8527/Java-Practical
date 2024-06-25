import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to simple calculator\n");
        System.out.println("Enter the first number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number : ");
        int secondNumber = sc.nextInt();
        String cal = " ";
        System.out.println("select the key you want to calculate('+','-','*','/')");
        cal = sc.next();
        switch(cal)
        {
            case "+":
            int add = firstNumber+secondNumber;
            System.out.println("Addition is : " + add);
            break;
            case "-":
            int sub = firstNumber+secondNumber;
            System.out.println("subraction is : " + sub);
            break;
            case "*":
            int mul = firstNumber*secondNumber;
            System.out.println("Multiplication is : " + mul);
            break;
            case "/":
            int division = firstNumber/secondNumber;
            System.out.println("Division is : " + division);
            break;
            default:
            System.out.println("invalid key");
        }

    }
}
