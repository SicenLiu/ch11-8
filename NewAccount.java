import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class NewAccount extends Account{
	private String name;	//�ͻ�����
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>(); //�洢�˻�������Ϣ
	//���캯��
	public NewAccount(String name, int id, double balance) {
		// TODO Auto-generated constructor stub
		this.name = new String(name);
		setId(id);
		setBalance(balance);
	}
	public String getName() {
		return name;
	}
	//��ӡ������Ϣ
	public void printTransactions() {
		for (int i = 0; i < transactions.size(); i++) {
			Transaction transaction = transactions.get(i);
			System.out.print((i + 1) + ": ");
			if (transaction.getType() == 'W') System.out.print("ȡ� ");
			else System.out.print("�� ");
			System.out.print(
					transaction.getAmount() + "���� �� " + transaction.getBalance());
			SimpleDateFormat bartDateFormat = new SimpleDateFormat
	  				("EEEE-MMMM-dd-yyyy"); 
			Date date = transaction.getDate();
			System.out.print("����  ����ʱ�䣺" + bartDateFormat.format(date)); 
			System.out.println("");
		}
	}
	//ȡ��
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
	//���
	public void deposit(double value) {
		double balance = getBalance();
		balance += value;
		setBalance(balance);
		Transaction transaction = new Transaction('D', value, balance, "");
		transactions.add(transaction);
	}
}
