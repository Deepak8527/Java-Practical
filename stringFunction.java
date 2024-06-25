import java.util.Scanner;

public class stringFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Five string function available here \n");
        System.out.println("Enter your anyaone name/place : ");
        String inpuString = scanner.nextLine();
        

        int length = inpuString.length();
        System.out.println("1. length of string is : " +length);

        String upperCase = inpuString.toUpperCase();
        System.out.println("2. upper case string : " + upperCase);

        String lowerCase = inpuString.toLowerCase();
        System.out.println("3. Lower case string : " + lowerCase);

        String trim = inpuString.trim();
        System.out.println("4. Trim string is : " + trim);

        System.out.println("Enter substring check");
        String subString = scanner.nextLine();
        boolean contain = inpuString.contains(subString);
        System.out.println("substring contain is : " + subString);
    }
}
