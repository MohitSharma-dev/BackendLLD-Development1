package IntroToOOP;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private String ownerName;
    private ArrayList<String> transactionHistory = new ArrayList<String>();

    public BankAccount() {
        balance = 0;
        ownerName = "";
    }

    public BankAccount(String ownerName1, double balance1) {
        balance = balance1;
        ownerName = ownerName1;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            transactionHistory.add("Deposited $" + amount);
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance = balance - amount;
            transactionHistory.add("Withdrawn $" + amount);
        }
    }

    public void printTransactionHistory(){
        for(String transaction : transactionHistory){
            System.out.println(transaction);
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setBalance(double updatedBalance) {
        balance = updatedBalance;
    }

    public void setOwnerName(String updatedOwnerName) {
        ownerName = updatedOwnerName;
    }
}
