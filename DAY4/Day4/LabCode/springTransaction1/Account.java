package com.trans;
public class Account {
    private String accountno;
    private float balance;
 
    public Account(String no, float balance) {
        super();
        this.accountno = no;
        this.balance = balance;
    }
    public String getAccountno() {
        return accountno;
    }
    public void setAccountno(String no) {
        this.accountno = no;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
}