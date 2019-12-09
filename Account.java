import java.util.Date;
import java.util.Scanner;

public class Account {
	
	
	public Verification () {
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
		} else {
			verified= false;
		}
		
		  //SYSTEM ALLOWS USER INTO SYSTEM
		if (verified) {
			return 
		} else {
			return 
		}
		
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
