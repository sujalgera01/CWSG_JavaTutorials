class Account implements IBalance{

	private double balance;


	public Account(double balance){

		this.balance=balance;

	}

	public void credit(double amount) throws NegativeException{
		if (amount < 0){
			throw new NegativeException("amount can't be less than zero");
		}else
			balance+=amount;
	}
	public void debit(double amount) throws NegativeException,BalanceLess{
		if (amount < 0){
			throw new NegativeException("amount can't be less than zero");
		}
		else{
      
			if (balance<amount){
				throw new BalanceLess("Debit amount exceeded account balance.");}
      
			else{
				balance-=amount;
          
			}  
		}
    }

	public double getBalance(){
		return balance;
	}
}

class NegativeException extends Exception {
	public NegativeException(String msg){
		super(msg);
	}
}
	class BalanceLess extends Exception {
		public BalanceLess(String msg){
		super(msg);
	}
}

class SavingsAccount extends Account{  
   private double interestRate;
  
  

class SavingsAccount extends Account{
  
   private double interestRate;
  
  
public SavingsAccount(double balance, double interestRate) {
       super(balance);
       this.interestRate = interestRate;
      
   }

public double calculateInterest (){
   return interestRate*super.getBalance();
}
public double totalAmount(){
   return super.getBalance()+this.calculateInterest();
}
}

/* Now, we will create CheckingAccounts Class */

class CheckingAccount extends Account{
   private double fee;
   double balance;
   public CheckingAccount(double balance, double fee) {
       super(balance);
       this.fee = fee;
      
   }

   public void debit(double amount) throws NegativeException, BalanceLess{
       super.debit(amount);
       balance=super.getBalance();
       balance-=fee;
   }

public double getBalance(){
       return balance;
   }
}

/*Interface*/

public interface IBalance{
double getBalance();
}

/*Account Tester Class */

public class AccountTester {
   public static void main(String[] args){
       SavingsAccount sa=new SavingsAccount(1000, 0.1);
       CheckingAccount ca=new CheckingAccount(1000, 100);
       System.out.println(ca.getBalance());
      
       System.out.println(sa.calculateInterest());
       System.out.println(sa.totalAmount());
       try{
       ca.debit(100);
       System.out.println(ca.getBalance());
       ca.credit(-100);
       sa.credit(-1);
       ca.debit(2000);
      
	}
       catch(Exception e){
           e.printStackTrace();
       }

	}
}
}