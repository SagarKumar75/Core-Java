
public class BankAccount {
    String accountNumber;
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.accountNumber = "123456789";
        b1.deposit(100);
        b1.checkBalance();

        b1.withdraw(10);
        b1.checkBalance();

    }

}
