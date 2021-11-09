package src;

public class Client {
	 
	public static void main(String[] args) {
		DepositMoney dm = new DepositMoney();
		TransferMoney tm = new TransferMoney();
		WithdrawMoney wm = new WithdrawMoney();
	 
		System.out.println("---New Feature---");
        dm.doBusiness();
        System.out.println("\nPlease wait a moment...");
        tm.doBusiness();
        System.out.println("\nProcessing...");
        wm.doBusiness();
	}
	 
}
 
		
