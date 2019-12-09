
import java.util.Scanner;
public class AtmSystem {
	//Arraylist to hold bank 
	//the ATM System holds customers with bank accounts (the System will act as the Bank)
	private ArrayList<Account> Bank; //accounts of bank
	private ArrayList<Customer> Users; //users of the bank
}
	// constructor to initialize ArrayList for the bank
public AtmSystem(){
	Bank = new ArrayList<>();
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

//parameter - newUser (customer) to be added
// add user to Customer list
public Customer addUser(String firstName, String lastName, String pin){
	Customer newUser = new Customer(firstName, lastName, pin, this);
	this.userList.add(newUser);

//check if ATm is authortized with accountnumber
public boolean aunthoritze(int accountNumber) {
	boolean isTrue = false;
	boolean is = false;
	For (Account A : Bank) {
		if(accountNumber ==
	}

	
	//System.out.println("Welcome to the ATM: Please select a choice");
	//Scanner sc = new Scanner(System.in);
	//enter Account Number
	//System.out.println("Enter Account Number:");
		
	//}
	//private static void transaction(){
	//}
	

}
