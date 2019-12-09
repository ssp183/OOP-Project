# OOP-Project
#Atm System

This is simple automatic teller machine; the user will insert their debit or ATM card into the machine which will allow for the system to proceed to user verification. The system will ask the user to enter their unique four digit pin code and upon verification the user will enter the system. Once logged in, the user can either deposit, withdraw, or check an account balance.

# Account.java
-- Account object for the users, contains account number, pin, and customer name
--get and set methods to update and retreive from the object

# Transaction.java
-After user is accepted into the system, user is taken to transaction menu
-Users can select to Withdraw, deposit, check balance. 
-After selecting one of the options, users can select how much money they would want to deposit or withdraw and from what account.
-If an account does not have enough money, user receivers error message: "Invalid Funds to complete request"
-If the machine cannot validate a deposit, the currency is returned and user receives error message: "Invalid Deposit"
- The system will ask whether or not the user has to do another transaction, and the user will select no. 
-The system will ask whether or not the user would like a receipt, and the user will select yes or no. If the user selects yes, a receipt will be printed. If the user selects no, the system will move forward with the final measures.
--The system will return the debit or ATM card to the user and wish them a good day.
# ATMSystem.java
- Main Class
