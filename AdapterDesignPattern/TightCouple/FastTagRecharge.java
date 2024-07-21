package AdapterDesignPattern.TightCouple;

public class FastTagRecharge {
    int recharge(YesBankAPI yb, int amount){
        if(yb.GetBalance()>=amount){
            System.out.println("Recharge is succesfull");
            return 1;
        }
        else{
            System.out.println("Insufficient balanace to recharge");
            return -1;
        }
    }
}
