# 🏦 Banking System using Core Java 🏦

## 📌 Project Overview

This is a simple **Banking System** implemented in **Core Java**. It allows users to create accounts, log in, deposit, withdraw money, and check transaction history. The system enforces account creation before login, ensuring security and proper user authentication.

## 📁 Project Structure

```
BankingSystemCoreJava/   # Main Project Folder
│── src/                 # Source Code Folder
│   │── Bank.java        # Main entry point of the program
│   │── BankService.java # Handles account creation, authentication, and retrieval
│   │── Account.java     # Represents a bank account
│   │── Transaction.java # Represents a transaction (Deposit/Withdrawal)
```

## 🚀 Features

- **Account Creation**: Users can create Savings or Current accounts.
- **User Authentication**: Ensures only registered users can log in.
- **Deposit & Withdrawal**: Allows users to deposit and withdraw money.
- **Transaction History**: Stores and displays transaction records.
- **Account Balance Inquiry**: Users can check their balance anytime.

---

## 📜 Code Explanation

### 🔹 `Bank.java` (Main Class)

- Starts the banking system.
- Provides an interactive **menu** to create an account, log in, and perform transactions.
- Enforces account creation before login.
- Handles **account authentication** and user session.

### 🔹 `BankService.java`

- **Manages accounts** using a `HashMap<String, Account>`.
- Provides methods for:
  - Creating an account (`createAccount`)
  - Authenticating users (`authenticateUser`)
  - Retrieving account details (`getAccount`)
  - Checking if any account exists (`isAccountListEmpty`)

### 🔹 `Account.java`

- Represents an individual bank account.
- Maintains:
  - **Account Number** (Auto-incremented)
  - **Username & Password** (For authentication)
  - **Account Type** (Savings/Current)
  - **Balance**
  - **Transaction History**
- Methods include:
  - `deposit(amount)`: Adds money to balance.
  - `withdraw(amount)`: Deducts money if sufficient balance exists.
  - `getBalance()`: Returns current balance.
  - `getTransactions()`: Returns transaction history.

### 🔹 `Transaction.java`

- Represents a **bank transaction** (Deposit or Withdrawal).
- Stores:
  - **Transaction Type** (Deposit/Withdrawal)
  - **Amount**
  - **Timestamp** (Formatted as `dd-MM-yyyy HH:mm:ss`)
- Overrides `toString()` to display transaction details.

---

## 🖥️ How to Run the Project

### **🔧 Prerequisites**

Ensure you have:

- Java Development Kit (JDK) installed (Version 8+ recommended)
- An IDE (Eclipse/IntelliJ IDEA) or a text editor (VS Code, Notepad++)

### **▶️ Running the Project**

1. **Clone the Repository**
   ```sh
   git clone https://github.com/prakadeesh-dev/BankingSystemCoreJava.git
   ```
2. **Navigate to Project Directory**
   ```sh
   cd BankingSystemCoreJava/src
   ```
3. **Compile and Run**
   ```sh
   javac Bank.java 
   java Bank
   ```

---

## 📌 Expected Output

```
 Welcome to Global Bank 

 1. Create Account 
 2. Login 
 3. Exit
 Choose an option: 1
 Enter Username: Prakadeesh
 Enter Password: Prakadeesh
 Enter Account Type (Savings/Current): Savings
 Enter Initial Deposit: 50000
 Account Created Successfully! Account No: 1001
 Now, Please log in to access your account

 1. Create Account 
 2. Login 
 3. Exit
 Choose an option: 2
 Enter Username: Prakadeesh
 Enter Password: Prakadeesh
 Login Successful!

 1. Deposit | 2. Withdraw | 3. Check Balance | 4. Transactions | 5. Logout
 Choose an option: 1
 Enter Amount to Deposit: 10000
 Deposit Successful! New Balance: $60000

 Choose an option: 2
 Enter Amount to Withdraw: 5000
 Withdrawal Successful! New Balance: $55000

 Choose an option: 3
 Your Balance: $55000

 Choose an option: 4
 Transaction History:
 14-02-2025 20:24:05 | Deposit    | $50000
 14-02-2025 20:24:08 | Deposit    | $10000
 20-02-2025 20:58:24 | Withdrawal | $5000

 Choose an option: 5
 Logged Out.

 1. Create Account 
 2. Login 
 3. Exit
 Choose an option: 3
 Thank you for using our banking system!
```

---

## 🤝 Contributing

Feel free to **fork** this repository and submit **pull requests** if you have improvements!

---

## 📜 License

This project is open-source and available under the **MIT License**.

---

## 📧 Contact

For any inquiries or suggestions, reach out at: 📩 Email: prakadeeshrajss\@gmail.com

