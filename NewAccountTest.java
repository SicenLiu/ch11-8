
public class NewAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount = 1000;
		NewAccount account = new NewAccount("George", 1122, amount);
		NewAccount.setAnnualInterestRate(0.015);
		//ģ�⽻�׹���
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		account.withDraw(5);
		account.withDraw(4);
		account.withDraw(2);
		//������
		System.out.println("����: " + account.getName()
						+ ", ���ʣ� " + account.getAnnualInterestRate()
						+ ", ��֧� " + amount);
		System.out.println("�˻��嵥��");
		account.printTransactions();
	}
}
