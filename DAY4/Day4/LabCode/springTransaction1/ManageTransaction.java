package com.trans;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import com.trans.ManageTransactionDao;
import com.trans.Account;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

public class ManageTransaction {
	ManageTransactionDao manageTransactionDao;

	private DataSourceTransactionManager  trManager;;
	
	public void setTrManager(DataSourceTransactionManager trManager) {
		this.trManager = trManager;
	}

	private TransactionTemplate transactionTemplate;
	

	public void doTransaction(final String fromAccountno,
			final String toAccountno, final float transferAmount) {
		 transactionTemplate = new TransactionTemplate(trManager);
    
		System.out.println("Before transaction balance status :");
		System.out.println("Acoount : " + fromAccountno + " Balance : "
				+ manageTransactionDao.getBalance(fromAccountno));
		System.out.println("Acoount : " + toAccountno + " Balance : "
				+ manageTransactionDao.getBalance(toAccountno));

		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				try {
					manageTransactionDao.transferAmount(toAccountno,	transferAmount);
					manageTransactionDao.deductTransferAmount(fromAccountno, transferAmount);
					System.out.println("Transaction Successful");

				} catch (Exception ex) {
					status.setRollbackOnly();
					System.out.println("Transaction rollbacked :" + ex.getMessage());
				}
			}
		});

		System.out.println("After transaction balance status :");
		System.out.println("Acoount : " + fromAccountno + " Balance : "
				+ manageTransactionDao.getBalance(fromAccountno));
		System.out.println("Acoount : " + toAccountno + " Balance : "
				+ manageTransactionDao.getBalance(toAccountno));
	}

	public void createAccountTable() {
		manageTransactionDao.createAccountTable();
	}

	public void createAccount(Account account) {
		manageTransactionDao.createAccount(account);
	}

	public void setManageTransactionDao(
			ManageTransactionDao manageTransactionDao) {
		this.manageTransactionDao = manageTransactionDao;
	}

	public void setTransactionTemplate(
			PlatformTransactionManager transactionManager) {
		this.transactionTemplate = new TransactionTemplate(transactionManager);
	}
}
