package AdapterDesignPattern.LooseCouple;

public class FastTagRecharge {
    int recharge(BankAPI yb, int amount){
        if(yb.checkBalance()>=amount){
            System.out.println("Recharge is succesfull");
            return 1;
        }
        else{
            System.out.println("Insufficient balanace to recharge");
            return -1;
        }
    }
}
