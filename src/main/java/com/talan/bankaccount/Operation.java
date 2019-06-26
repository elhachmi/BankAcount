package com.talan.bankaccount;

import java.util.Date;

abstract public class Operation {

    protected Date date;

    protected double amount;

    protected double balance;

    protected String type;

    public double getAmount() {
        return this.amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getType() {
        return this.type;
    }

    public Date getDate() {
        return this.date;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setType(String type) {
        this.type = type;
    }
}
