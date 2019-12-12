import java.util.Date;
import java.util.Scanner;

public class Account {
	
	public void Verification () {
		
		boolean verified;
		
		  //USER ENTERS ACCOUNTNUMBER
		Scanner accountnum = new Scanner(System.in);
		System.out.println("Enter your sixteen digit account number: "); 
		int accountNumber= accountnum.nextInt();
		accountnum.close();
		int truePin= ATMSystem(accountNumber);
		
      		  //USER ENTERS PIN
		Scanner input = new Scanner(System.in);
      		System.out.println("Enter your four digit pin number: "); 
       		int pin = input.nextInt();
		input.close();
		
		  //SYSTEM VERIFIES WITH TRUEPIN FROM ATM SYSTEM
		if (pin == truePin) {
			verified = true; 
			System.out.println("Correct PIN, you may now enter the system.");
		} else {
			verified= false;
			System.out.println("Incorrect PIN or Account Number");
		}
		
		 //SYSTEM ALLOWS USER INTO SYSTEM
		if (verified) {
			 Transactions.main();
		} else {
			 Account.Verification();
		}
			 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
