import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.trans.ManageTransaction;
import com.trans.Account;

public class TransactionTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("transaction.xml");
		ManageTransaction manageTransaction = (ManageTransaction) context.getBean("ManageTransactionBean");
		Account account1 = new Account("acc1", 10000);
		Account account2 = new Account("acc2", 15000);
		manageTransaction.createAccountTable();
		manageTransaction.createAccount(account1);
		manageTransaction.createAccount(account2);
		manageTransaction.doTransaction("acc1", "acc2", 2000);
	}
}