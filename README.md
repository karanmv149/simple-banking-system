This is a basic console-based banking application written in Java. It allows users to manage a simple bank account by performing fundamental operations like checking the balance, depositing money, and withdrawing funds.

Features
View current account balance
Deposit money (only amounts ≥ ₹1)
Withdraw money (only if balance is sufficient and amount ≥ ₹1)
Simple and intuitive text-based menu
Graceful exit with a thank-you message

🧱 Technologies Used
Java (Standard Edition)
Scanner class for input handling
Basic control structures (if-else, switch, loops)

🛠 How It Works
When the program runs:
A menu is displayed with options to:
Show balance
Deposit funds
Withdraw funds
Exit the program

The user selects an option by entering a number (1-4).
Based on input, the relevant method is called:
Show_Balance() displays the current balance
Deposit() allows the user to add funds if the amount is valid
Withdraw() lets the user withdraw funds if sufficient balance exists
