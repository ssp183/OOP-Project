import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

process();
	}
private static void process() {
Scanner scan = new Scanner (System.in);
float balance= 0;
float deposit;
float withdraw;
int nextStep;

	System.out.println("Please choose a service:");
	System.out.println("Press 0 to Deposit:");
	System.out.println("Press 2 to Withdraw:");
	System.out.println("Press 4 to Check Balance:");
	 
	nextStep= scan.nextInt();
	

switch(nextStep) {
case 0:
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
	balance= balance- withdraw;
	System.out.println("Your withdrawn amount is:" +withdraw);
	System.out.println("Your balance is:" +balance);
	additionTransaction();
	break;

case 4:
	System.out.println("Your balance is:" +balance);
	additionTransaction();
break;
	}

}
private static void additionTransaction() {
	Scanner scan = new Scanner (System.in);
	System.out.println("Press 3 for choosing another transaction ");
	 int additionTransaction;
    additionTransaction=scan.nextInt();
    process();
    if (additionTransaction!=3) {
    	System.out.println("Please choose option 3");
    }
    else if(additionTransaction== 3){
    		additionTransaction();
    	}
    }
    


}
