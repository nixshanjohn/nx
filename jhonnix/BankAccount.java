public class BankAccount {
	
	private double balance;
	private double interest = 7;
	
	public BankAccount (double initBalance) {
		balance = initBalance;
		
	}
	public double getBalance () {
		return balance;
		
	}
	public void withdraw (double amount) {
		balance = balance - amount;
		
	}
	public void deposit(double amount) {
		
		balance = balance + amount ;
	
	}
	public void addInterest() {
		
		balance = balance + ((interest/100)*balance)/12;
		
				
	}
	public static void main (String[]args) {
		BankAccount Sri = new BankAccount(1000);
		BankAccount Nix = new BankAccount(2000);
		BankAccount San = new BankAccount(0);
		
		System.out.println("Balance Sri:"+Sri.getBalance());
		System.out.println("Balance Nix:"+Nix.getBalance());
		System.out.println("Balance San:"+San.getBalance());
		System.out.println("*******************************");
		
		Sri.deposit(300);
		System.out.println("Balance Sri:"+Sri.getBalance());
		
		
		Nix.withdraw(30);
		System.out.println("Balance Nix:"+Nix.getBalance());
		
		Sri.addInterest();
		Nix.addInterest();
		San.addInterest();
		
		System.out.println("*********************************");
		System.out.println();
		System.out.println("Balance Sri:"+Sri.getBalance());
		System.out.println("Balance Nix:"+Nix.getBalance());
		System.out.println("Balance San:"+San.getBalance());
		
	}
	
	
	

}
