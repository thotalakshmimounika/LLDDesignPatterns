package AdapterDesignPattern.LooseCouple;

public class LoanEligibility {
    boolean checkLoanEligibility(BankAPI yb){
        if(yb.checkBalance()>100){
            return true;
        }
        return false;
    }
}
