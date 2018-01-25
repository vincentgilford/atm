package atm;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class AtmTest {

	@Test
	public void shouldHaveDefaultBalance(){
		//arrange
		Atm underTest = new Atm(); 
	
		//act
		double balance = underTest.getBalance(); 
		
		//assert
		Assert.assertEquals(500.00, balance, 0.001);
	
	
	}
	
	@Test
	public void shouldWithdramFifty() {
		//arrange
		Atm underTest = new Atm(); 
		underTest.withDraw(50); 
		double balance = underTest.getBalance(); 
		Assert.assertEquals(450.00,balance, .001);
	}
	
	
	
	@Test
	public void shouldHaveStartingBalance() {
		//arrange
		Atm underTest = new Atm(500.00);
		
		//act
		double balance = underTest.getBalance(); 
				
		//assert
		Assert.assertEquals(500.00, balance, 0.001);		
	}
	
	@Test
	public void shouldAllowAccess() {
		Atm underTest = new Atm();
		boolean check =  underTest.allowAccess("1234");	
//		Assert.assertEquals(true, check);
		Assert.assertTrue(check);
	}
	
	
	@Test
	public void shouldDenyAccessByPin(){
		Atm underTest = new Atm();
		boolean check =  underTest.allowAccess("4567");	
		Assert.assertFalse(check);	
	}
	
	@Test
	public void shouldDepositMoney800() {
		Atm underTest = new Atm(); 
		underTest.depositMoney(300);   
		double balance = underTest.getBalance();
		Assert.assertEquals(800, balance, .001);
	}
	
	@Test
	public void shouldDespoitMoney700() {
		Atm underTest = new Atm();
		underTest.depositMoney(700);
		double balance = underTest.getBalance(); 
		Assert.assertEquals(1200, balance, .001);
	}
	
	
	
	
	
}
	
	
