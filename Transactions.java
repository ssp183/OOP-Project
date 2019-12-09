import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
float balance= 0;
float deposit;
float withdraw;
int additionTransaction;
int nextStep;

	System.out.println("Please choose a service:");
	System.out.println("1. Deposit:");
	System.out.println("2. Withdraw:");
	System.out.println("3. Check Balance:");
	 
	nextStep= scan.nextInt();
	

switch(nextStep) {
case 1:
	System.out.println("Please enter the amount you would like to deposit:");
	deposit= scan.nextFloat();
	balance+= deposit;
	System.out.println("You deposited:" +deposit);
	System.out.println("New balance is:" +balance);
}
	}
}
