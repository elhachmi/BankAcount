package com.talan.bankaccount;

import java.sql.Date;

public class Withdrawal extends Operation {

    private static final String TYPE = "WITHDRAWAL";

    public Withdrawal(Double amount, Double balance) {
        this.type = Withdrawal.TYPE;
        this.date = new Date(System.currentTimeMillis());
        this.amount = amount;
        this.balance = balance;
    }
}
