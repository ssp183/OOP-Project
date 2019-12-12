
import java.util.Scanner;
public class AtmSystem {
	//Arraylist to hold bank & users
	//the ATM System holds customers with bank accounts (the System will act as the Bank)
	private ArrayList<Account> Bank; //accounts of bank
	private ArrayList<Customer> User; //users of the bank
}
	// constructor to initialize ArrayList for the bank
public AtmSystem(){
	Bank = new ArrayList<Account>();
	User = new ArrayList<Customer>();
}

//parameter - A (account) to be added
//add account to Bank list 
public void addBank(Account A){
	Bank.add(A);
}

//list of accounts for the Bank
public void showAccounts(){
	for (Account A : Bank) System.out.println(A.toString());
}

//parameter - User (customer) to be added
// add user to Customer list
public Customer addUser(String firstName, String lastName, int pin){
	Customer User = new Customer(firstName, lastName, pin, this);
	this.User.add(newUser);
	
	return User;

}

//check if ATM is authortized with accountnumber
public Customer userLogin(double accountNumber) { 
	//search for matching accountnumber in system and return int pin
	
	return pin;
}
}
