package Adapter.PhonePeV1;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please tell us which bank do you want to use!");
        String BankName = scanner.nextLine();

        BankAPI bankAPI = null;
        if(BankName.equals("Yes Bank")){
            bankAPI = new YesBankAPIAdapter();
        } else if(BankName.equals("ICICI Bank")){
            bankAPI = new ICICIBankAPIAdapter();
        }

        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.rechargFasttag(50);
        phonePe.availLoan(900);

    }
}
