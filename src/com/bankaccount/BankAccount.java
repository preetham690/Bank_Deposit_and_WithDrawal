package com.bankaccount;

public class BankAccount {
    private String accountNum;
    private float balance;
    private String customerName;
    private String email;
    private int phoneNum;

    //creating constructor


//    public BankAccount(String accountNum, float balance, String customerName, String email, int phoneNum) {
//        this.accountNum = accountNum;
//        this.balance = balance;
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNum = phoneNum;
//    }

    //creating getter and setter method
    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAccountNum() {
        return accountNum;
    }
    public float getBalance() {
        return balance;
    }
    public int getPhoneNum() {
        return phoneNum;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }

    public void deposit(float depositAmt){
        this.balance+=depositAmt;
        System.out.println("Deposited amount : "+depositAmt+" new balance "+balance);
    }
    public void withdrawal(float withdrawalAmt){
        if (balance-withdrawalAmt<0){
            System.out.println("available balance is : "+ balance + " Insufficient balance");
        }else {
            balance-=withdrawalAmt;
            System.out.println("Remaining balance : "+ balance);
        }
    }

}
