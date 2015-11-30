import java.util.*;
//记录每笔交易的类
public class Transaction {
	private Date date;			//交易时间
	private char type;			//交易类型
	private double amount;		//交易金额
	private double balance;		//账户余额
	private String description;	//交易描述
	//构造函数
	public Transaction(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = new String(description);
		date = new Date();
	}
	public Date getDate() {
		return date;
	}
	public char getType() {
		return type;
	}
	public double getAmount() {
		return amount;
	}
	public double getBalance() {
		return balance;
	}
	public String getDescription() {
		return description;
	}
	public void setType(char type) {
		this.type = type;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
