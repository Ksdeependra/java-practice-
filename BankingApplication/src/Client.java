
public class Client {

	public static void main(String[] args) throws InsufficientOpeningBalanceException {
	     AxisBank b1=new AxisBank() ;
	     System.out.println(b1.createAccount(104,4000));
	     System.out.println(b1.createAccount(106,5000));
	     try 
	     {
	    	System.out.println("Balance:"+b1.withdrawAmount(104,200));
	    	System.out.println("Balance:"+b1.withdrawAmount(106,300));
	    	System.out.println("Balance:"+b1.withdrawAmount(104,50));
	    	System.out.println("Balance:"+b1.withdrawAmount(106,200));
	    	System.out.println("Balance:"+b1.DepositAmount(106,2000));
	    	System.out.println("Balance:"+b1.FundTransfer(104, 106, 2000));
	    	System.out.println("Balance:"+b1.withdrawAmount(104,200));
	     }
	     catch(InvalidAccountNumberException i)
	     {
	    	System.out.println("Inavalid account number");
	    	
	     }
	     catch(InsufficientBalanceException ibe) 
	     {
	    	System.out.println("insufficient account balance");
	     }
	     
	     
	     
	     

	}

}
