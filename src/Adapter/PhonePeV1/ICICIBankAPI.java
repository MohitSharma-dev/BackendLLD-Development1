package Adapter.PhonePeV1;

public class ICICIBankAPI {
    public int getBalance(){
        System.out.println("Checking the balance via ICICI Bank");
        return 100;
    }

    public void transfer(){
        System.out.println("Transferring Money via ICICI");
    }
}
