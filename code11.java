class BankAccount {
    private double balance;

    void deposit(double amount) {
        if (amount > 0) balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) balance = balance - amount;
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(500);    // deposit 500
        acc.withdraw(200);   // withdraw 200
        acc.withdraw(400);   // ignored, not enough balance

        System.out.println("Balance: " + acc.getBalance());
    }
}
