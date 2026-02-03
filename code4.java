class BankAccount {
    String accountHolderName;
    int balance;

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolderName = "John";
        acc.balance = 1000;

        acc.balance = acc.balance + 500;   // deposit
        System.out.println("Balance: " + acc.balance);

        acc.balance = acc.balance - 300;   // withdraw
        System.out.println("Balance: " + acc.balance);
    }
}
