import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner (System.in);
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
case 1:
	System.out.println("Please enter the amount you would like to deposit:");
	deposit= scan.nextFloat();
	balance+= deposit;
	System.out.println("You deposited:" +deposit);
	System.out.println("Your balance is:" +balance);

break;

case 2:
	System.out.println("Please enter the amount you would like to withdraw:");
	withdraw=scan.nextFloat();
	balance-= withdraw;
	System.out.println("Your withdrawn amount is:" +withdraw);
	System.out.println("Your balance is:" +balance);
	break;

case 3:
	System.out.println("Your balance is:" +balance);
break;
	}

}
private static void additionTransaction() {
	Scanner scan = new Scanner (System.in);
	 int additionTransaction;
    additionTransaction=scan.nextInt();
    System.out.println("Press 3 for choosing another transaction ");
    process();
    if (additionTransaction!=3) {
    	System.out.println("Please choose option 3");
    }
    else if(additionTransaction== 3){
    		additionTransaction();
    	}
    }
    


}
