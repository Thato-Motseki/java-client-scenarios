public class Account {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

        public void deposit(double amount)
            throws IllegalArgumentException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Deposit amount must be greater than zero."
            );
        }

        balance += amount;
    }

        public void withdraw(double amount)
            throws IllegalArgumentException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal amount must be greater than zero."
            );
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Insufficient funds."
            );
        }

        balance -= amount;
    }
}