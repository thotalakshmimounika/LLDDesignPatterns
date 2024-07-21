package AdapterDesignPattern.LooseCouple;

public class ICICBankAPIAdapter implements BankAPI{
    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public void TracsferMoney(int amount) {

    }
}
