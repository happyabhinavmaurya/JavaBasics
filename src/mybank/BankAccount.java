package mybank;

public class BankAccount {

    // attributes
    private int accountNumber;
    private double balance;

    // Getter
    /*
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setter
    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
     */
    // Constructors -> same name as that of class
    public BankAccount(int accountNumber, Double initialBalance) {
        // keyword -> this -> particular object
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Methods
    public void deposit_amount(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Total Amount Deposited:" + amount + "\nNew Balance: " + balance);
        } else {
            System.out.println(amount + "is an invalid amount. Please enter a valid amount.");
        }
    }

    public void withdraw_amount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful of amount:" + amount + "\nAvailable balance is: " + balance);
        } else {
            System.out.println("Invalid or insufficient account. Please enter a valid amount.");
        }
    }

    public void check_balance() {
        System.out.println("Available balance is: " + balance);
    }
}
