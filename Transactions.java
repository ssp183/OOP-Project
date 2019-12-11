import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

process();
	}
private static void process() {
Scanner scan = new Scanner (System.in);
float balance= 8000;
float deposit;
float withdraw;
int nextStep;

	System.out.println("Please choose a service:");
	System.out.println("Press 1 to Deposit:");
	System.out.println("Press 2 to Withdraw:");
	System.out.println("Press 3 to Check Balance:");
	System.out.println("Press 4 to exit:");
	nextStep= scan.nextInt();
	
if (nextStep<5) {
switch(nextStep) {
case 1:
	System.out.println("Please enter the amount you would like to deposit:");
	deposit= scan.nextFloat();
	balance= balance + deposit;
	System.out.println("You deposited:" +deposit);
	System.out.println("Your balance is:" +balance);
	additionTransaction();
break;

case 2:
	System.out.println("Please enter the amount you would like to withdraw:");
	withdraw=scan.nextFloat();
	if (withdraw> balance) {
		System.out.println("You do not have sufficient funds");
	}
	else {
		balance= balance- withdraw;
		System.out.println("Your withdrawn amount is:" +withdraw);
	}
	System.out.println("Your balance is:" +balance);
	additionTransaction();
	break;

case 3:
	System.out.println("Your balance is:" +balance);
	additionTransaction();
break;

case 4:
	System.out.println("Thank you, have a nice day!");
	System.exit(0);
	}
}
else {
	System.out.println("Invalid entry, please choose from the given option ");
	process();
}
}
private static void additionTransaction() {
	Scanner scan = new Scanner (System.in);
	System.out.println("Press 5 for choosing another transaction ");
	 int additionTransaction;
    additionTransaction=scan.nextInt();
    
	  if (additionTransaction== 5) {
    	process();
  
    }
	  else if (additionTransaction!=5) {
	 additionTransaction();
   }
	  
   
}
}
