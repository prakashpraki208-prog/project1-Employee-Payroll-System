class ATM {
    double balance;

    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.balance = 1000; // initial balance

        // Deposit
        myATM.balance = myATM.balance + 500;
        System.out.println("Balance after deposit: " + myATM.balance);

        // Withdraw
        myATM.balance = myATM.balance - 300;
        System.out.println("Balance after withdrawal: " + myATM.balance);

        // Check balance
        System.out.println("Current balance: " + myATM.balance);
    }
}
