package DecoratorDesignPattern;

public class DarkRoast implements Beverage{
    @Override
    public int getCost() {
        return 120;
    }

    @Override
    public void getDescription() {
        System.out.println("Dark Roast : "+getCost());
    }
}
