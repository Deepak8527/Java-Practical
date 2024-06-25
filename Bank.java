import java.util.Scanner;

public class Bank {
    private double balance;

    // Constructor
    public Bank(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit of rupay " + amount + " successful.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal of rupay " + amount + " successful.");
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient funds.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance + " Rs");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the bank account with an initial balance
        System.out.println("Enter initial balance: " + " Rs");
        double initialBalance = scanner.nextDouble();
        Bank account = new Bank(initialBalance);

        // Menu for operations
        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount: Rs");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount: Rs");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}


