class ATM {
    private double balance;
    private int pin;

    // Constructor to set initial balance and pin
    ATM(double initialBalance, int setPin) {
        balance = initialBalance;
        pin = setPin;
    }

    // Validate PIN
    boolean validatePin(int enteredPin) {
        return enteredPin == pin;
    }

    // Withdraw money if PIN is correct
    void withdraw(int enteredPin, double amount) {
        if (validatePin(enteredPin)) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    // Get current balance
    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        ATM myATM = new ATM(1000, 1234);

        myATM.withdraw(1234, 500);   // correct PIN
        myATM.withdraw(1111, 200);   // wrong PIN
        System.out.println("Balance: " + myATM.getBalance());
    }
}

