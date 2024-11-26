package IntroToOOP;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    SavingsAccount(double userBalance){
        interestRate = 0.05;
        setBalance(userBalance);
        setOwnerName("Temporary");
    }

    void applyInterest(){
        double balance = getBalance();
        balance = balance + balance * interestRate;
        setBalance(balance);
    }

}
