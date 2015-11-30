import java.util.*;
//原始的Account类
public class Account {
	private int id = 0;								//账户id
	private double balance = 0;						//账户余额
	private static double annualInterestRate = 0;	//当前利率
	private Date dateCreated;						//账户开户日期
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void setAnnualInterestRate(double interestRate) {
		annualInterestRate = interestRate;
	}
	public Date getdateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	public boolean withDraw(double value) {
		if (value > balance) return false;
		else {
			balance -= value;
			return true;
		}
	}
	public void deposit(double value) {
		balance += value;
	}
}
