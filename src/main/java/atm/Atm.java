package atm;

public class Atm {
	private double balance; 
	private String requiredPIN = "1234";  
	
	
	public double getBalance() {
		return balance;
	}
	
	public Atm() {
//		balance = 500.00;// TODO Auto-generated constructor stub
		this(500.00);//calling the other constructor within the class
	}
	
	public Atm(double amount) {
		balance = amount; // TODO Auto-generated constructor stub
	}

	public void withDraw(int amountToWithdraw) {
		// TODO Auto-generated method stub
		balance -= amountToWithdraw;
	}

	public boolean allowAccess(String enteredPin) {
		return enteredPin.equals(requiredPIN);
	}



	
	
	
}
