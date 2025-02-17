import java.util.HashMap;
import java.util.Map;

public class BankService 
{
    private Map<String, Account> accounts = new HashMap<>();

    // Create Account (check for username)
    public int createAccount(String username, String password, String accountType, double initialDeposit)
    {
        if (accounts.containsKey(username)) // checks the key of username
        {
            return -1;  // Username already exists
        }
        Account account = new Account(username, password, accountType, initialDeposit); 

        accounts.put(username, account);

        return account.getAccountNumber();  // return int method
    }

    // Authenticate User
    public boolean authenticateUser(String inputusername, String inputpassword)
    {
        return accounts.containsKey(inputusername) && accounts.get(inputusername).validatePassword(inputpassword);
    }

    // Get Account by Username
    public Account getAccount(String username) 
    {
        return accounts.get(username);
    }

    // Check if account list is empty (to enforce account creation first)
    public boolean isAccountListEmpty() 
    {
        return accounts.isEmpty();
    }
}
