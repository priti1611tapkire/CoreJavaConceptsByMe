package comsynchro;

public class Customer {
	int amount=10000;  

	synchronized void withdraw(int amount){  
		System.out.println("going to withdraw...");  

		if(this.amount<amount){  
			System.out.println("Less balance; waiting for deposit...");  
			try{
				wait();
			}
			catch(Exception e){
				e.printStackTrace();
			}  
		}  
		this.amount-=amount;  
		System.out.println("withdraw completed...");  
	}  

	synchronized void deposit(int amount){  
		System.out.println("going to deposit...");  
		this.amount+=amount;  
		System.out.println("deposit completed... ");  ///2nd thread complete
		notify();  //1st thread
	}  

}
