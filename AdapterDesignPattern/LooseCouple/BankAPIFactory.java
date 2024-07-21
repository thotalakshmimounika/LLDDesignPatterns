package AdapterDesignPattern.LooseCouple;

public class BankAPIFactory {
    public static BankAPI getBankAPIByName(String BankAPIName){
        if(BankAPIName.equals("YesBankAPI")){
            return new YesBankAPIAdapter();
        }
        else if(BankAPIName.equals("ICICBankAPI")){
            return new ICICBankAPIAdapter();
        }
        else{
            throw new IllegalArgumentException("Your Bank is not available at the moment");
        }
    }
}
