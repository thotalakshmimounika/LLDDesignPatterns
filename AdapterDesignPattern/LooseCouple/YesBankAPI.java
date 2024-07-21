package AdapterDesignPattern.LooseCouple;

public class YesBankAPI {
    public int GetBalance(){
        return 100;
    }
    public void MoneyTransfer(){
        System.out.println("Transfered Money via Yes Bank");
    }
}
