package AdapterDesignPattern.LooseCouple;

public class PhonePe {
    BankAPI yb;
    LoanEligibility lb = new LoanEligibility();
    FastTagRecharge ft = new FastTagRecharge();

    public void setBankAPI(BankAPI yb) {
        this.yb = yb;
    }

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
