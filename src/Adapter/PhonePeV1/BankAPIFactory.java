package Adapter.PhonePeV1;

public class BankAPIFactory {
    public static BankAPI getBankAPIByBankName(String BankName) {
        BankAPI bankAPI = null;
        if(BankName.equals("Yes Bank")){
            bankAPI = new YesBankAPIAdapter();
        } else if(BankName.equals("ICICI Bank")){
            bankAPI = new ICICIBankAPIAdapter();
        } else if(BankName.equals("Axis Bank")){
//            bankAPI = new AxisBankAPIAdapter();
        }
        return bankAPI;
    }
}
