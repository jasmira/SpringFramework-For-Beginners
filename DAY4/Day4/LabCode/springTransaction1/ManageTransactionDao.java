package com.trans;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.trans.ManageTransaction;
import com.trans.Account;

public class ManageTransactionDao {
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public float getBalance(String fromAccountno) {
		return this.jdbcTemplate.queryForInt(
				"select balance from Account where accountno=?",
				new Object[] { fromAccountno });
	}

	public void deductTransferAmount(String fromAccountno, float transferAmount)
			throws Exception {
		float balance = getBalance(fromAccountno);
		if (balance < transferAmount)
			throw new Exception("Insufficient Balance");
		jdbcTemplate.update(
				"update Account set balance=balance-? where accountno=?",
				new Object[] { transferAmount, fromAccountno });
	}

	public void transferAmount(String toAccountno, float transferAmount) {
		jdbcTemplate.update("update Account set balance=balance+? where accountno=?",
				new Object[] { transferAmount, toAccountno });
	}

	public void createAccount(Account account) {
		jdbcTemplate.update(
				"insert into Account (accountno,balance) values (?,?)",
				new Object[] { account.getAccountno(), account.getBalance() });
	}

	public void createAccountTable() {
		jdbcTemplate
				.execute("create table If Not Exists Account (accountno char(4) primary key,balance float)");
	}
}