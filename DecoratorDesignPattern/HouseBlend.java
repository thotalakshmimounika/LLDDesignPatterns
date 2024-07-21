package DecoratorDesignPattern;

public class HouseBlend implements Beverage{
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public void getDescription() {
        System.out.println("House Blend : "+getCost());;
    }
}
