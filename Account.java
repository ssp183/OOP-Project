import java.util.Date;
import java.util.Scanner;

public class Account {
	
	
	public boolean Verification {
		
	Scanner input = new Scanner(System.in);
	int accountNumber ;
        //USER ENTERS PIN
        System.out.println("Enter your four digit pin number: "); 
        int pin = input.nextInt();
	ATMSystem(accountNumber, pin);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
