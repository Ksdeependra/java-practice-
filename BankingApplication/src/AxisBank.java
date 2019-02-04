import java.util.LinkedList;
public class AxisBank {
	LinkedList<Account> a1=new LinkedList<>();
	
	public String createAccount(int accountNumber,int accountBalance)throws InsufficientOpeningBalanceException
	{ 
		if(accountBalance<500)
		{
		throw new InsufficientOpeningBalanceException();
	    }
		
		Account account=new Account(accountNumber,accountBalance);
		a1.add(account);
		return "account created successfully";
             		
	}
	private Account searchAccount(int accountNumber)throws InvalidAccountNumberException
	{
		for(Account account:a1)
		{
			if(account. getAccountNumber()==accountNumber)
				return account;
		}
		throw  new InvalidAccountNumberException();
			
	}
	int withdrawAmount(int accountNumber,int amount)throws InsufficientBalanceException,InvalidAccountNumberException
	{
	  Account account=searchAccount(accountNumber);
	   if(account.getAccountBalance()-amount>0)
	   {
		   account.setAccountBalance(account.getAccountBalance()-amount);
		   return account.getAccountBalance();
	   }
	   throw new InsufficientBalanceException();
			  
	}
	public int DepositAmount(int accountNumber,int accountBlance)throws InsufficientBalanceException, InvalidAccountNumberException  
	{
		Account account=searchAccount(accountNumber);
				 account.setAccountBalance(account.getAccountBalance()+accountBlance);
		   return account.getAccountBalance();
				
	}
	public int FundTransfer(int wtdacc,int depacc,int accountBalance)throws InsufficientBalanceException, InvalidAccountNumberException  
	{
		Account p=searchAccount(wtdacc);
		Account q=searchAccount(depacc);
		withdrawAmount(wtdacc, accountBalance);
		 DepositAmount(depacc,accountBalance);
		 return q.getAccountBalance();
		 
	}

	}
	
	
	


