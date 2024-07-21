package AdapterDesignPattern.LooseCouple;

import AdapterDesignPattern.TightCouple.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI{
    YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public int checkBalance() {
        return yesBankAPI.GetBalance();
    }

    @Override
    public void TracsferMoney(int amount) {
        yesBankAPI.MoneyTransfer();
    }
}
