public class BankAccount {

    private String accountNumber;

    private double balance;

    private String accountHolderName;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative");
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolderName("John Doe");
        account.setAccountNumber("826346826384632");
        account.setBalance(37493.43);
        System.out.println("Account - Holder name: " + account.getAccountHolderName() + ", Account number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        try {
            account.setBalance(-122);
        } catch (IllegalArgumentException e) {
            System.out.println("Error setting balance - " + e);
        }
    }
}
