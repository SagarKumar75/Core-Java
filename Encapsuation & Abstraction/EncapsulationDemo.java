class BankAccount {
    private String accountNumber;
    private double balance;

    // constructor

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // getter

    public double getBalance() {
        return balance;
    }

    // setter

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 5000);

        acc.deposit(2000);
        System.out.println("balance: " + acc.getBalance());

        acc.withdraw(1500);

        System.out.println("Balance: " + acc.getBalance());
    }

}
