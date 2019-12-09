
import java.util.Scanner;
public class AtmSystem {
	//Arraylist to hold bank 
	private ArrayList<Account> Bank;
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
