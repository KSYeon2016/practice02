package prob3;

public class Account {
	private String accountNo;
	private int balance = 0;
	
	public Account(String accountNo){
		this.accountNo = accountNo;
		System.out.println(accountNo + " 계좌가 개설되었습니다.");
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 입금
	public int save(int s){
		balance = balance + s;
		System.out.println(accountNo + " 계좌에 " + s + "만원이 입금되었습니다.");
		return balance;
	}
	
	// 출금
	public int deposit(int d){
		balance = balance - d;
		System.out.println(accountNo + " 계좌에 " + d + "만원이 출금되었습니다.");
		return balance;
	}
}
