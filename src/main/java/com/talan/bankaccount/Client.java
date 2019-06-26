package com.talan.bankaccount;

public class Client {

    protected String fullName = null;

    protected String uid = null;

    protected Account account = null;

    public void setFullname(String fullName) {
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public Account getAccount() {
        return account;
    }

    public String getFullname() {
        return this.fullName;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * Display account history as string, with user info and operations details
     */
    public void displayAccountHistory() {
        this.getAccount().getOperations().forEach(
            (elem) -> System.out.println(".....")
        );
        
    }
}
