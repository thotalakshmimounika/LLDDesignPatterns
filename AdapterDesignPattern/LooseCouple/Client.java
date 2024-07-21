package AdapterDesignPattern.LooseCouple;

import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String BankAPIName = scanner.nextLine();
        BankAPI bankAPI = BankAPIFactory.getBankAPIByName(BankAPIName);
        PhonePe p = new PhonePe();
        p.setBankAPI(bankAPI);
    }
}
