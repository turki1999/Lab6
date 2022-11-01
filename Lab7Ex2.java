class BankAccount
{
    private double balance;

    public BankAccount()
    {
        balance = 0;
    }


    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    public void deposit(double amount)
    {
        double newBalance = balance + amount;
        balance = newBalance;
    }


    public void withdraw(double amount)
    {
        double newBalance = balance - amount;
        balance = newBalance;
    }


    public double getBalance()
    {
        return balance;
    }
}
class BasicAccount extends BankAccount{


    BasicAccount(double initialBalance) {

    }
    public void withdraw(double amount) {
        if (amount > 0 && this.balance - amount >= 0) {
            super.getBalance() -= amount;
        } else if (amount < 0) {
            throw new IllegalArgumentException("Withdraw amount should be positive and greater than 0.");
        } else {
            System.out.println("Error: Withdraw amount exceeds available funds.");
        }
    }



}

class Main {
    public static void main(String args[]) {
        BankAccount account = new BasicAccount(100.00);
        double balance = account.getBalance(); //expected 100.00;

        account.withdraw(80.00);
        balance = account.getBalance(); //expected 20.00;

        account.withdraw(50.00);
        balance = account.getBalance(); //expected 20.00 because the amount to withdraw is larger than the balance
    }
}