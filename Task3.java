import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void withdraw(double amount) {
        if (bankAccount.getBalance() >= amount) {
            bankAccount.setBalance(bankAccount.getBalance() - amount);
            System.out.println("Withdrew Rs." + amount + ". Your new balance is Rs." + bankAccount.getBalance());
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        System.out.println("Deposited Rs: " + amount + ". Your new balance is Rs: " + bankAccount.getBalance());
    }

    public void checkBalance() {
        System.out.println("Your current balance is Rs: " + bankAccount.getBalance());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your initial balance: ");
        double balance = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount(balance);
        ATM atm = new ATM(bankAccount);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
