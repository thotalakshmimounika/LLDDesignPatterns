package DecoratorDesignPattern;

public class Mocha implements AddOn{
    Beverage b;
    Mocha(Beverage b) {
        this.b = b;
    }
    @Override
    public int getCost() {
        return b.getCost()+10;
    }

    @Override
    public void getDescription() {
        b.getDescription();
        System.out.println("Mocha Added : "+getCost());
    }
}
