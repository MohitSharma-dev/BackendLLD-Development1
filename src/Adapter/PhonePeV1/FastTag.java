package Adapter.PhonePeV1;

public class FastTag {
    public boolean recharge(int amount, BankAPI bankAPI){
//        we need to check the balance first
        if(bankAPI.checkBalance() >= amount){
            System.out.println("Successfully recharged");
            return true;
        }
        return false;
    }
}
