import java.util.Scanner;

public class Bank 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        BankService bankService = new BankService();

        System.out.println(" Welcome to Global Bank ");

        // Enforce account creation before login
        while (true) 
        {
            System.out.println("\n1. Create Account \n2. Login \n3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (option == 1) 
            {
                // User must create an account before logging in
                System.out.print("Enter Username: ");
                String username = scanner.nextLine();

                System.out.print("Enter Password: ");
                String password = scanner.nextLine();

                System.out.print("Enter Account Type (Savings/Current): ");
                String accountType = scanner.nextLine();
                
                System.out.print("Enter Initial Deposit: ");
                double initialDeposit = scanner.nextDouble();

                int accountNum = bankService.createAccount(username, password, accountType, initialDeposit);

                if (accountNum != -1)
                {
                    System.out.println(" Account Created Successfully! Account No: " + accountNum);
                    System.out.println(" Now, Please log in to access your account");
                }
                else 
                {
                    System.out.println(" Username already exists! Try a different one");
                }
            }
            else if (option == 2) 
            {
               if (bankService.isAccountListEmpty()) 
               {
                    System.out.println(" No accounts found! Please create an account first");
                    continue;
                }

                System.out.print("Enter Username: ");
                String username = scanner.nextLine();
                System.out.print("Enter Password: ");
                String password = scanner.nextLine();

                if (!bankService.authenticateUser(username, password)) 
                {
                    System.out.println(" Invalid Credentials! Try again ");
                    continue;
                }

                System.out.println(" Login Successful!");
                
                Account account = bankService.getAccount(username);
                
                boolean loggedIn = true;

                while (loggedIn) 
                {
                    System.out.println("\n1. Deposit | 2. Withdraw | 3. Check Balance | 4. Transactions | 5. Logout");
                    System.out.print("Choose an option: ");
                    int choice = scanner.nextInt();

                    switch (choice) 
                    {
                        case 1:
                            System.out.print("Enter Amount to Deposit: ");
                            double deposit = scanner.nextDouble();
                            account.deposit(deposit);
                            System.out.println(" Deposit Successful! New Balance: $" + account.getBalance());
                            break;
                            
                        case 2:
                            System.out.print("Enter Amount to Withdraw: ");
                            double withdrawAmount = scanner.nextDouble();
                            if (account.withdraw(withdrawAmount))
                            {    
                                System.out.println(" Withdrawal Successful! New Balance: $" + account.getBalance());
                            }
                            else
                            {
                                System.out.println(" Insufficient Funds!");
                            }
                            break;

                        case 3:
                            System.out.println(" Your Balance: $" + account.getBalance());
                            break;

                        case 4:
                            System.out.println(" Transaction History:");
                            for (Transaction t : account.getTransactions()) 
                            {
                                System.out.println(t);
                            }
                            break;

                        case 5:
                            loggedIn = false;
                            System.out.println(" Logged Out.");
                            break;
                            
                        default:
                            System.out.println(" Invalid Option!");
                    }
                }
            } 
            else if (option == 3) 
            {
                System.out.println(" Thank you for using our banking system!");
                break;
            } 
            else 
            {
                System.out.println(" Invalid Option!");
            }
        }
        scanner.close();
    }
}
