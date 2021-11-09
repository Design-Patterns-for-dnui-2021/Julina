package src;

public class WithdrawMoney extends BankTransaction {
	
	@Override
	public void doBusiness() {
		System.out.println("You withdraw $100 from your bank account.");
		
	}
		
	boolean performBusiness() {
		return false;
	}
 
}


		


