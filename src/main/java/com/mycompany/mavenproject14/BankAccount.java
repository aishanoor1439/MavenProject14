
package com.mycompany.mavenproject14;

//Class Definition
public class BankAccount {
    
//    Attributes
    private String accountHolder;
    private double balance;
    
//    Methods
    
//    Constructors
    BankAccount(){
        this.accountHolder = "Unknown";
        this.balance = 0;
        System.out.println("The Account has been created for " + accountHolder + " user.");
    }
    BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
        System.out.println("Account created for: " + accountHolder + " with balance: " + balance);
    }
    BankAccount(String accountHolder, double initialDeposit){
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        System.out.println("Account created for " + accountHolder + " with initial deposit of PKR " + initialDeposit);
    }
    
}
