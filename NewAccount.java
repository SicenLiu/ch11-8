import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class NewAccount extends Account{
	private String name;	//客户姓名
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>(); //存储账户交易信息
	//构造函数
	public NewAccount(String name, int id, double balance) {
		// TODO Auto-generated constructor stub
		this.name = new String(name);
		setId(id);
		setBalance(balance);
	}
	public String getName() {
		return name;
	}
	//打印交易信息
	public void printTransactions() {
		for (int i = 0; i < transactions.size(); i++) {
			Transaction transaction = transactions.get(i);
			System.out.print((i + 1) + ": ");
			if (transaction.getType() == 'W') System.out.print("取款： ");
			else System.out.print("存款： ");
			System.out.print(
					transaction.getAmount() + "美金， 余额： " + transaction.getBalance());
			SimpleDateFormat bartDateFormat = new SimpleDateFormat
	  				("EEEE-MMMM-dd-yyyy"); 
			Date date = transaction.getDate();
			System.out.print("美金，  交易时间：" + bartDateFormat.format(date)); 
			System.out.println("");
		}
	}
	//取款
	public boolean withDraw(double value) {
		double balance = getBalance();
		if (value > balance) return false;
		else {
			balance -= value;
			Transaction transaction = new Transaction('W', value, balance, "");
			transactions.add(transaction);
			setBalance(balance);
			return true;
		}
	}
	//存款
	public void deposit(double value) {
		double balance = getBalance();
		balance += value;
		setBalance(balance);
		Transaction transaction = new Transaction('D', value, balance, "");
		transactions.add(transaction);
	}
}
