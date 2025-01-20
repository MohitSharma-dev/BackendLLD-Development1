package Adapter.PhonePeV1;

public class ICICIBankAPIAdapter implements BankAPI{
    ICICIBankAPI iciciBankAPI =new ICICIBankAPI();
    @Override
    public int checkBalance() {
        return iciciBankAPI.getBalance();
    }

    @Override
    public void transferMoney() {
        iciciBankAPI.transfer();
    }
}
