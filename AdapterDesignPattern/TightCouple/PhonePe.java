package AdapterDesignPattern.TightCouple;

public class PhonePe {
    YesBankAPI yb= new YesBankAPI();
    LoanEligibility lb = new LoanEligibility();
    FastTagRecharge ft = new FastTagRecharge();
    Boolean checkLoanEligibility(){
        return lb.checkLoanEligibility(yb);
    }

    int rechargeFastTag(){
        if(ft.recharge(yb,1000)>0){
            return 1;
        }
        else{
            throw new RuntimeException("Add more funds");
        }
    }
}
