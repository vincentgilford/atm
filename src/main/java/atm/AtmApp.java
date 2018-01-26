package atm;

import java.util.Scanner;

public class AtmApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Atm myAccount = new Atm(100.00);
		String requiredPIN = "1234"; 
		
		System.out.println("Enter your pin.");
		String enteredPin = input.nextLine(); 
		
		while(!myAccount.allowAccess(enteredPin)) {
			System.out.println("Invalid Access. Please Try Again");
			enteredPin = input.nextLine(); 
		}
		String optionEntered;
		System.out.println("Welcome to the Bank of We Can Code IT!");
		System.out.println("Choose an option.");
		System.out.println("Press 1 to deposit funds.");
		System.out.println("Press 2 to withdrawal funds.");
		System.out.println("Press 3 to check balance.");
		System.out.println("Press 4 to exit.");
		optionEntered = input.nextLine();
		
		while(!optionEntered.equals("4")){	
		
			if (optionEntered.equals("1")) {
				System.out.println("Please enter amount to deposit?");
				int moneyToDeposit = input.nextInt();
				myAccount.depositMoney(moneyToDeposit);
				System.out.println(
						"You have deposited " + moneyToDeposit + " and your balance is now " + myAccount.getBalance());
			}

			if (optionEntered.equals("2")) {
				System.out.println("Please enter amount to withdraw?");
				int withDrawAmount = input.nextInt();
				myAccount.withDraw(withDrawAmount);
				System.out.println(
						"You have withdrawn " + withDrawAmount + " and your balance is now " + myAccount.getBalance());
			}

			
			if(optionEntered.equals("3")) {
				System.out.println("Your Balance is: " + myAccount.getBalance());	
			}
			
						
			System.out.println("Choose an option.");
			System.out.println("Press 1 to deposit funds.");
			System.out.println("Press 2 to withdrawal funds.");
			System.out.println("Press 3 to check balance.");
			System.out.println("Press 4 to exit.");
			optionEntered = input.next();

			
			if (optionEntered.equals("4")) {
				System.out.println("GoodBye");
				System.exit(0);
			
			
			}
		
		}
		
		
		
	}

}
