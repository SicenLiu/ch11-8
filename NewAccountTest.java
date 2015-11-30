
public class NewAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount = 1000;
		NewAccount account = new NewAccount("George", 1122, amount);
		NewAccount.setAnnualInterestRate(0.015);
		//模拟交易过程
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		account.withDraw(5);
		account.withDraw(4);
		account.withDraw(2);
		//输出结果
		System.out.println("姓名: " + account.getName()
						+ ", 利率： " + account.getAnnualInterestRate()
						+ ", 收支额： " + amount);
		System.out.println("账户清单：");
		account.printTransactions();
	}
}
