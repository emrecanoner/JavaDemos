public class AccountManager {
    private double balance;
    public void deposit(double amount){
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInSufficientException {
        if (balance>=amount){
            balance = getBalance() - amount;
        }else{
            throw new BalanceInSufficientException("Bakiye yetersiz.");
        }

    }

    public double getBalance() {
        return balance;
    }
}
