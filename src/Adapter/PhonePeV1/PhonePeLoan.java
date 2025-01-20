package Adapter.PhonePeV1;

public class PhonePeLoan {
    public boolean checkEligibility(int amount, BankAPI bankAPI){
//        Loan will be allocated only if you have at least 10% of the loan
        if(bankAPI.checkBalance() >= amount * .1){
            System.out.println("Loan can be availed");
            return true;
        }
        return false;
    }

}
