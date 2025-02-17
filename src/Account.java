import java.util.ArrayList;
import java.util.List;

public class Account 
{
    private static int accountCounter = 1001; // Auto-incremented account number
    private int accountNumber;
    private String accountType;
    private double balance;
    private String username;  // Unique username for login
    private String password;  // Password for authentication
    private List<Transaction> transactions;

    public Account(String username, String password, String accountType, double initialBalance)
    {
        this.accountNumber = accountCounter++;
        this.username = username;
        this.password = password;
        this.accountType = accountType;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public String getUsername()
    {
        return username;
    }

    public boolean validatePassword(String inputPassword)
    {
        return this.password.equals(inputPassword);
    }

    public void deposit(double amount)
    {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
    }

    public boolean withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount));
            return true;
        }
        return false;
    }

    public double getBalance()
    {
        return balance;
    }

    public List<Transaction> getTransactions() 
    {
        return transactions;
    }
}
