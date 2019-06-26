package com.talan.bankaccount;

import java.sql.Date;

public class Deposit extends Operation {

    private static final String TYPE = "DEPOSIT";

    public Deposit(Double amount, Double balance) {
        this.type = Deposit.TYPE;
        this.date = new Date(System.currentTimeMillis());
        this.amount = amount;
        this.balance = balance;
    }
}
