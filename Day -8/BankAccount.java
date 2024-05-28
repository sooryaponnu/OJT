public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
    public void checkBalance() {
        System.out.println("Account balance: $" + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe", 1000);
        account.checkBalance();
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000);
        account.checkBalance();
    }
}
