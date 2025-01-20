package Adapter.PhonePeV0;

public class PhonePeLoan {
    public boolean checkEligibility(int amount, YesBankAPI yesBankAPI){
//        Loan will be allocated only if you have at least 10% of the loan
        if(yesBankAPI.balanceCheck() >= amount * .1){
            System.out.println("Loan can be availed");
            return true;
        }
        return false;
    }

}
