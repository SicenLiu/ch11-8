import java.util.*;
//��¼ÿ�ʽ��׵���
public class Transaction {
	private Date date;			//����ʱ��
	private char type;			//��������
	private double amount;		//���׽��
	private double balance;		//�˻����
	private String description;	//��������
	//���캯��
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
