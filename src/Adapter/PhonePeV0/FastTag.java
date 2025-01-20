package Adapter.PhonePeV0;

public class FastTag {
    public boolean recharge(int amount, YesBankAPI yesBankAPI){
//        we need to check the balance first
        if(yesBankAPI.balanceCheck() >= amount){
            System.out.println("Successfully recharged");
            return true;
        }
        return false;
    }
}
