package AdapterDesignPattern.TightCouple;

public class LoanEligibility {
    boolean checkLoanEligibility(YesBankAPI yb){
        if(yb.GetBalance()>100){
            return true;
        }
        return false;
    }
}
