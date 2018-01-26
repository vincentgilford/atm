package atm;
import java.math.*; 

public class Atm {
	private double amountInAtm;
	private BigDecimal balance = new BigDecimal(amountInAtm); 
	private String requiredPIN = "1234";  
	
	
	public BigDecimal getBalance() {
		return balance;
	}
	
	public Atm() {
//		balance = 500.00;// TODO Auto-generated constructor stub
		this(500.00);//calling the other constructor within the class
	}
	
	public Atm(double amount) {
		amountInAtm = amount; // TODO Auto-generated constructor stub
	}

	public void withDraw(int amountToWithdraw) {
		// TODO Auto-generated method stub
		if(amountToWithdraw<amountInAtm) {
			System.out.println("Withdrawal exceeds current balance");
		}
		amountInAtm -= amountToWithdraw;
	}

	public boolean allowAccess(String enteredPin) {
		return enteredPin.equals(requiredPIN);
	}

	public void depositMoney(int moneyToDeposit) {
		// TODO Auto-generated method stub
		if(moneyToDeposit<0) {
			System.out.println("Please enter a postive amount. Thank you");
		}
		
		amountInAtm += moneyToDeposit;
	}



	
	
	
}
