package com.talan.bankaccount;

import java.util.UUID;
import java.util.ArrayList;

public class Account {

    protected String number = null;

    protected Double balance = null;

    ArrayList<Operation> operations = new ArrayList<Operation>();

    public Account(Double initialBalance) {
        this.number = this.generateNumber();
        this.balance = initialBalance;
    }

    public String generateNumber() {
        return (UUID.randomUUID()).toString();
    }

    public Double getBalance() {
        
        return this.balance;
    }

    public Deposit deposit(Double amount) {
        this.balance += amount;
        Deposit deposit = new Deposit(amount, this.balance);
        this.operations.add(deposit);

        return deposit;
    }    

    public Withdrawal withdraw(Double amount) throws NoSufficientFundsException {
        if(amount > this.balance) {
            throw new NoSufficientFundsException();
        } 
        this.balance -= amount;
        Withdrawal withdrawal = new Withdrawal(amount, this.balance);
        this.operations.add(withdrawal);

        return withdrawal;
    }
    
    public ArrayList<Operation> getOperations() {
        return this.operations;  
    }


}
