package Adapter.PhonePeV1;

public class YesBankAPIAdapter implements BankAPI{
    YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public int checkBalance() {
        return yesBankAPI.balanceCheck();
    }

    @Override
    public void transferMoney() {
        yesBankAPI.moneyTransfer();
    }
}
