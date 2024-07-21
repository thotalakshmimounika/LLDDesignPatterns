package DecoratorDesignPattern;

public class Milk implements AddOn{
    Beverage b;
    Milk(Beverage b) {
        this.b = b;
    }
    @Override
    public int getCost() {
        return b.getCost()+15;
    }

    @Override
    public void getDescription() {
        b.getDescription();
        System.out.println("Milk Added : " + getCost());
    }
}
